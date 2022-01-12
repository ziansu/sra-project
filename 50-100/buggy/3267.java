@java.lang.Override
public java.lang.Object intercept(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] args, com.github.drinkjava2.cglib3_2_0.proxy.MethodProxy cgLibMethodProxy) throws java.lang.Throwable {
    if ((!(myAdvisors.isEmpty())) && (myAdvisors.get(0).match(obj.getClass().getName(), method.getName())))
        return new com.github.drinkjava2.jbeanbox.AdviceCaller(this, obj, method, args, cgLibMethodProxy, myAdvisors).callNextAdvisor();
    else
        return cgLibMethodProxy.invokeSuper(obj, args);
    
}