@java.lang.Override
public void method(aQute.bnd.osgi.Clazz.MethodDef method) {
    int access = method.getAccess();
    if ((java.lang.reflect.Modifier.isAbstract(access)) || (java.lang.reflect.Modifier.isStatic(access)))
        return ;
    
    if ((!(baseclass)) && (java.lang.reflect.Modifier.isPrivate(access)))
        return ;
    
    this.member = method;
    methods.add(method.getName(), method);
}