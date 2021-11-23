public java.lang.String[] removeDuplicates(java.lang.String[] arr) {
    java.util.ArrayList<java.lang.String> arrClean = new java.util.ArrayList<>();
    for (java.lang.String s : arr) {
        s = s.trim();
        if (!(arrClean.contains(s))) {
            arrClean.add(s);
        }
    }
    return arrClean.toArray(new java.lang.String[arrClean.size()]);
}