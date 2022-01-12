@java.lang.Override
public final int hashCode() {
    if ((_hash) != 0)
        return _hash;
    
    int seed = ("Tuple" + (getArity())).hashCode();
    int h = leon.codegen.runtime.LeonCodeGenRuntimeHashing.seqHash(elements, seed);
    _hash = h;
    return h;
}