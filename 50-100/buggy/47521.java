public static boolean isInLinearizationBody(com.rockwellcollins.atc.agree.agree.Expr expr) {
    boolean result = false;
    org.eclipse.emf.ecore.EObject current = expr.eContainer();
    while ((current != null) && (current instanceof com.rockwellcollins.atc.agree.agree.Expr)) {
        org.eclipse.emf.ecore.EObject container = current.eContainer();
        if (container instanceof com.rockwellcollins.atc.agree.agree.LinearizationDefExpr) {
            result = ((com.rockwellcollins.atc.agree.agree.LinearizationDefExpr) (container)).getExprBody().equals(current);
        }
        current = container;
    } 
    return result;
}