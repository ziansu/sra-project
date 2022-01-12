@java.lang.Override
public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
    java.util.ArrayList<java.lang.Object> args2 = new java.util.ArrayList<java.lang.Object>();
    args2.add(this);
    args2.addAll(java.util.Arrays.asList(args));
    return javelin.Core.apply(methods.get(method.getName()), args2);
}