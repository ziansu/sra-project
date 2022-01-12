@java.lang.Override
public int hashCode(T obj) {
    int hash = 0;
    for (java.util.function.Function f : functions) {
        if (hash == 0)
            hash = f.apply(obj).hashCode();
        else
            hash = keyless.api.hash.HashFunctions.combineHashes().apply(new java.lang.Integer[]{ hash , f.apply(obj).hashCode() });
        
    }
    return hash;
}