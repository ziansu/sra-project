public java.util.HashSet<java.lang.Integer> getEntryForParentChild(int index) {
    java.util.HashSet<java.lang.Integer> result = new java.util.HashSet<>();
    try {
        if ((hashtable.get(index)) != null) {
            result = ((java.util.HashSet<java.lang.Integer>) (hashtable.get(index)));
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Database cannot find object" + index));
        e.printStackTrace();
    }
    return result;
}