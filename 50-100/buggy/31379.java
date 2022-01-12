public java.util.ArrayList<java.util.ArrayList<java.lang.String>> getArray(java.lang.String channel) {
    synchronized(log) {
        if (log.containsKey(channel)) {
            java.util.ArrayList<java.util.ArrayList<java.lang.String>> newArray = new java.util.ArrayList<>();
            newArray.addAll(log.get(channel));
            return newArray;
        }else {
            return null;
        }
    }
}