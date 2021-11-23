public static ccl.iface.IExpression<java.lang.Object> createInterfaceInstance(java.lang.Class<?> iface, ccl.iface.IExpression<? extends java.lang.Object> expression) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    java.lang.Class<?> clss = ccl.vm.core.bridge.JInterfaceBuilder.makeNormalClass(iface);
    java.lang.reflect.Constructor<?> constructor = clss.getConstructor(java.lang.reflect.InvocationHandler.class);
    return new ccl.vm.core.Expression<java.lang.Object>(constructor.newInstance(new ccl.vm.core.bridge.JInvocationHandler(iface, expression)));
}