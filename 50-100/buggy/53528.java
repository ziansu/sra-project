private boolean assertArrayListExt(java.util.ArrayList<java.util.ArrayList<java.lang.String>> expected, java.util.ArrayList<java.util.ArrayList<java.lang.String>> result) {
    boolean contains = false;
    for (java.util.ArrayList<java.lang.String> listExp : expected) {
        contains = false;
        for (java.util.ArrayList<java.lang.String> listRes : result) {
            if ((listExp.containsAll(listRes)) && (listRes.containsAll(listExp))) {
                contains = true;
                break;
            }
        }
        if (!contains)
            return false;
        
    }
    return true;
}