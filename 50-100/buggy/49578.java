public static boolean isUnique(byte[] a, boolean omitCheck) {
    if ((a.length) < 2)
        return true;
    
    if ((!omitCheck) && (!(com.github.methylene.sym.ArrayUtil.isSorted(a))))
        a = com.github.methylene.sym.ArrayUtil.sortedCopy(a);
    
    byte previous = a[0];
    for (byte i : a)
        if (i == previous)
            return false;
        
    
    return true;
}