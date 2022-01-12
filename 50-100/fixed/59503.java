public java.util.HashMap<java.lang.Integer, java.lang.Integer> getEntryForInvertedIndex(int index) {
    java.util.HashMap<java.lang.Integer, java.lang.Integer> result = new java.util.HashMap<>();
    try {
        if ((hashtable.get(index)) != null) {
            result = ((java.util.HashMap<java.lang.Integer, java.lang.Integer>) (hashtable.get(index)));
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Database cannot find object" + index));
        e.printStackTrace();
    }
    return result;
}