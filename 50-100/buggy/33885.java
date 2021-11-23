@java.lang.Override
public <T> T foldMap(java.util.function.BiFunction<T, java.lang.Double, T> foldFun, java.util.function.DoubleFunction<java.lang.Double> mapFun) {
    T t = null;
    int len = sto.size();
    for (int i = 1; i < len; i++)
        t = foldFun.apply(t, mapFun.apply(sto.get(i)));
    
    return t;
}