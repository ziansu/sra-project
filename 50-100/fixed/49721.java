private java.util.List getItems() {
    java.util.List items = new java.util.ArrayList();
    for (int a = 0; a < (fridge.size()); a++) {
        if (((fridge.get(a)) != null) && (((com.example.matt.yumly20.FoodItem) (fridge.get(a))).group.equals(group))) {
            items.add(fridge.get(a));
        }
    }
    items.add(null);
    return items;
}