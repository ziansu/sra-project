public java.lang.String[] removeDuplicates(java.lang.String[] arr) {
    java.util.ArrayList<java.lang.String> arrClean = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : arr) {
        s = s.trim();
        if (!(arrClean.contains(s)))
            arrClean.add(s);
        
    }
    java.lang.String[] result = arrClean.toArray(new java.lang.String[arrClean.size()]);
    return result;
}