public java.util.List getItems() {
    java.util.List items = new java.util.ArrayList();
    for (int a = 0; a < (fridge.size()); a++) {
        if (((com.example.matt.yumly20.FoodItem) (fridge.get(a))).group.equals(group)) {
            items.add(fridge.get(a));
        }
    }
    return items;
}