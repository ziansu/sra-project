public java.util.List<partypeople.Item> getItemsNeeded() {
    java.util.ArrayList<partypeople.Item> itemsList = new java.util.ArrayList<partypeople.Item>();
    if ((itemsNeeded) != null) {
        for (com.googlecode.objectify.Ref<partypeople.Item> item : itemsNeeded) {
            partypeople.Item temp = item.getValue();
            if (item != null) {
                itemsList.add(temp);
            }
        }
    }
    return itemsList;
}