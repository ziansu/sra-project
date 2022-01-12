public static boolean isUnique(char[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    char previous = a[0];
    for (char i : a)
        if (i == previous)
            return false;
        
    
    return true;
}