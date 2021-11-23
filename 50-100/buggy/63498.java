public static void main(java.lang.String[] args) {
    com.vincenteof.demo.dynamicproxy.Foo foo = ((com.vincenteof.demo.dynamicproxy.Foo) (java.lang.reflect.Proxy.newProxyInstance(com.vincenteof.demo.dynamicproxy.Foo.class.getClassLoader(), new java.lang.Class[]{ com.vincenteof.demo.dynamicproxy.FooImpl.class }, new com.vincenteof.demo.dynamicproxy.FooInvocationHandler(new com.vincenteof.demo.dynamicproxy.FooImpl()))));
    foo.fooDo();
}