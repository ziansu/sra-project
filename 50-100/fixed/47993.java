@java.lang.Override
public java.util.Vector map(java.util.Vector vec, java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> fun) {
    checkCardinality(vec);
    int len = sto.size();
    for (int i = 0; i < len; i++)
        storageSet(i, fun.apply(storageGet(i), vec.get(i)));
    
    return this;
}