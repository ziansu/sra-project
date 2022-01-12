public static boolean isUnique(int[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    for (int i = 1; i < (a.length); i++)
        if ((a[i]) == (a[(i - 1)]))
            return false;
        
    
    return true;
}