public static int seqHash(java.lang.Object[] elements, int seed) {
    int h = leon.codegen.runtime.LeonCodeGenRuntimeHashing.avalanche((seed ^ -889275714));
    int sz = elements.length;
    if (sz == 0)
        return h;
    
    for (java.lang.Object element : elements) {
        h = leon.codegen.runtime.LeonCodeGenRuntimeHashing.mix(h, element.hashCode());
    }
    return leon.codegen.runtime.LeonCodeGenRuntimeHashing.finalizeHash(h, sz);
}