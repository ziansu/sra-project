@java.lang.Override
public void processInput() {
    java.lang.String[] items = super.parseItems();
    for (java.lang.String item : items) {
        java.util.List<java.lang.String> fields = processItem(item);
        leczner.jon.HurtLocker.Grocery grocery = leczner.jon.HurtLocker.Grocery.groceryFactory(fields);
        if (grocery != null) {
            groceryList.add(grocery);
        }
    }
    groceryManager = new leczner.jon.HurtLocker.GroceryManager(groceryList);
}