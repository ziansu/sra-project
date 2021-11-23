private void achieveFunctorMethods(org.teavm.jso.plugin.DependencyAgent agent, java.lang.String type, org.teavm.jso.plugin.MethodDependency caller) {
    if (caller.isMissing()) {
        return ;
    }
    org.teavm.model.ClassReader cls = agent.getClassSource().get(type);
    if (cls != null) {
        for (org.teavm.model.MethodReader method : cls.getMethods()) {
            agent.linkMethod(method.getReference(), null).use();
        }
    }
}