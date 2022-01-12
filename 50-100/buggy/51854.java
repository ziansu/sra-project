public void add(com.ivanchug.moneytracker.api.Item item) {
    java.lang.String date = formater.format(item.getDate());
    if (itemsToShow.isEmpty())
        itemsToShow.add(new com.ivanchug.moneytracker.api.HeaderItem(date));
    
    if (!(((com.ivanchug.moneytracker.api.HeaderItem) (itemsToShow.get(0))).getDate().equals(date)))
        itemsToShow.add(new com.ivanchug.moneytracker.api.HeaderItem(date));
    
    itemsToShow.add(1, item);
    notifyItemInserted(1);
}