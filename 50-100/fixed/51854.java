public void add(com.ivanchug.moneytracker.api.Item item) {
    java.lang.String date = formater.format(item.getDate());
    if ((itemsToShow.isEmpty()) || (!(((com.ivanchug.moneytracker.api.HeaderItem) (itemsToShow.get(0))).getDate().equals(date)))) {
        itemsToShow.add(0, new com.ivanchug.moneytracker.api.HeaderItem(date));
        notifyItemInserted(0);
    }
    itemsToShow.add(1, item);
    notifyItemInserted(1);
}