@java.lang.Override
public java.lang.Object convert(java.lang.Class requested, java.lang.String[] in) {
    java.lang.Object ret = java.lang.reflect.Array.newInstance(requested.getComponentType(), in.length);
    int i = 0;
    for (java.lang.String s : in) {
        java.lang.reflect.Array.set(ret, i, each.convert(requested.getComponentType(), s));
        i++;
    }
    return ret;
}