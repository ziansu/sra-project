public <T> java.lang.Object getEntryForMapping(T index) {
    java.lang.Object result = null;
    try {
        result = ((hashtable.get(index)) == null) ? null : hashtable.get(index);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Database cannot find object" + index));
        e.printStackTrace();
    }
    return result;
}