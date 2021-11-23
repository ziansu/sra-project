private void addCellPlaceholder(java.util.Map<java.lang.Integer, java.lang.String> headerMap, int key) {
    java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.String>> entrySet = headerMap.entrySet();
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : entrySet) {
        if ((entry.getKey()) == key) {
            if (entry.getValue().equals("")) {
                java.lang.System.out.println(("Add place holder for :" + key));
                headerMap.put(key, getCell(null, com.e.s.tool.config.SubscriberGroupHanlder.COLUMN_TYPE.CONTEXT));
            }
        }
    }
}