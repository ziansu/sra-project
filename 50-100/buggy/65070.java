public void setRxResponseEntry(int[] data) {
    if ((rxResponseMap) == null) {
        rxResponseMap = new java.util.HashMap<java.lang.Integer, java.lang.Integer>();
    }
    rxResponseMap.put(java.lang.Integer.valueOf(data[0]), java.lang.Integer.valueOf(data[0]));
}