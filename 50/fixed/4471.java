@java.lang.Override
public int route(java.lang.Object key) {
    return ((java.lang.Math.abs(key.hashCode())) % ((numberOfRoutes) + 1)) - 1;
}