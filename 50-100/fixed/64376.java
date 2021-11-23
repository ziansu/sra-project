public <T> java.lang.Object getEntryForMapping(T index) {
    java.lang.Object result = new java.lang.Object();
    try {
        if ((hashtable.get(index)) != null) {
            result = hashtable.get(index);
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Database cannot find object" + index));
        e.printStackTrace();
    }
    return result;
}