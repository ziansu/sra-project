public static void listInv(java.util.ArrayList<com.crooks.InventoryItem> itemList) {
    int i = 1;
    for (com.crooks.InventoryItem item1 : itemList) {
        int totalWeight = (item1.weight) * (item1.itemQuantity);
        java.lang.System.out.print(java.lang.String.format("%s. %sx %s - %s - %s lbs\n", i, item1.itemQuantity, item1.itemName, item1.category, ((item1.weight) * (item1.itemQuantity))));
        i++;
    }
}