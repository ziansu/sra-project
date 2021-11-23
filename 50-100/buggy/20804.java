public static final int seqHash(java.lang.Object[] elements, int seed) {
    int h = leon.codegen.runtime.LeonCodeGenRuntimeHashing.avalanche((seed ^ -889275714));
    int sz = elements.length;
    if (sz == 0)
        return h;
    
    for (int i = 0; i < sz; i++) {
        h = leon.codegen.runtime.LeonCodeGenRuntimeHashing.mix(h, elements[i].hashCode());
    }
    return leon.codegen.runtime.LeonCodeGenRuntimeHashing.finalizeHash(h, sz);
}