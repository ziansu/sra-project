public static void draw(org.metacsp.framework.ConstraintNetwork cn) {
    if ((cn.getVariables().length) > 0)
        org.metacsp.framework.ConstraintNetwork.draw(cn, cn.getVariable(0).getConstraintSolver().getClass().getSimpleName(), null);
    else
        org.metacsp.framework.ConstraintNetwork.draw(cn, cn.getClass().getSimpleName(), null);
    
}