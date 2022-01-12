public static boolean isUnique(int[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    int previous = a[0];
    for (int i : a)
        if (i == previous)
            return false;
        
    
    return true;
}