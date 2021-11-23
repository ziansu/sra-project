@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null)
        return false;
    
    com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor.MethodCall mc = ((com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor.MethodCall) (obj));
    return ((mc.clazz.equals(clazz)) && (mc.name.equals(name))) && (java.util.Arrays.equals(mc.args, args));
}