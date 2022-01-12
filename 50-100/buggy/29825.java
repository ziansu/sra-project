public java.util.ArrayList<java.lang.String> queryByItem(java.lang.String iD) {
    java.util.ArrayList<java.lang.String> itemInfo;
    synchronized(this) {
        for (int i = 0; i < (itemList.size()); i++) {
            itemInfo = itemList.get(i);
            if (itemInfo.contains(iD)) {
                return itemInfo;
            }
        }
    }
    itemInfo = new java.util.ArrayList<java.lang.String>(1);
    itemInfo.add("invalid itemNumber");
    itemInfo.add("-1");
    return itemInfo;
}