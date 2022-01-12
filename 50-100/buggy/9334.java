private gr.uom.java.ast.MethodInvocationObject recurseDelegations(gr.uom.java.ast.MethodInvocationObject methodInvocation, gr.uom.java.ast.SystemObject system) {
    gr.uom.java.ast.MethodInvocationObject delegation;
    if (((delegation = system.containsDelegate(methodInvocation)) != null) && ((system.getClassObject(delegation.getOriginClassName())) != null))
        return recurseDelegations(delegation, system);
    else
        return methodInvocation;
    
}