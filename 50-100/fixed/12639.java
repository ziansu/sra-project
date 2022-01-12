public static boolean contains(java.lang.String target, java.lang.String[] strings, boolean totalMatch) {
    for (java.lang.String s : strings) {
        s = s.toLowerCase();
        if (totalMatch ? target.equals(s) : target.contains(s)) {
            return true;
        }
    }
    return false;
}