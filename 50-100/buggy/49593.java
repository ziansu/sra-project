public static boolean isUnique(long[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    long previous = a[0];
    for (long i : a)
        if (i == previous)
            return false;
        
    
    return true;
}