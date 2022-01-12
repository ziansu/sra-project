public static void draw(org.metacsp.framework.ConstraintNetwork cn, org.metacsp.utility.UI.Callback cb) {
    if ((cn.getVariables().length) > 0)
        org.metacsp.framework.ConstraintNetwork.draw(cn, cn.getVariable(0).getConstraintSolver().getClass().getSimpleName(), cb);
    else
        org.metacsp.framework.ConstraintNetwork.draw(cn, cn.getClass().getSimpleName(), cb);
    
}