public void addAll(java.util.List<com.ivanchug.moneytracker.api.Item> items) {
    if ((items == null) || (items.isEmpty()))
        return ;
    
    java.util.TreeMap<java.lang.String, java.util.List<com.ivanchug.moneytracker.api.Item>> itemsDividedByDate = divideByDate(items);
    for (java.lang.String date : itemsDividedByDate.keySet()) {
        com.ivanchug.moneytracker.api.HeaderItem header = new com.ivanchug.moneytracker.api.HeaderItem(date);
        itemsToShow.add(header);
        for (com.ivanchug.moneytracker.api.Item item : itemsDividedByDate.get(date)) {
            itemsToShow.add(item);
        }
    }
    notifyDataSetChanged();
}