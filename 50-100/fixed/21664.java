@java.lang.Override
public java.util.Vector map(java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> fun, double y) {
    int len = sto.size();
    for (int i = 0; i < len; i++)
        sto.set(i, fun.apply(sto.get(i), y));
    
    return this;
}