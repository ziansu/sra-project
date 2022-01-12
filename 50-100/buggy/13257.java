public static boolean isUnique(short[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    short previous = a[0];
    for (short i : a)
        if (i == previous)
            return false;
        
    
    return true;
}