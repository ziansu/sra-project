private void addItemsComboBox(javax.swing.JComboBox<java.lang.String> categoryComboBox, javax.swing.JComboBox<java.lang.String> itemComboBox) {
    itemComboBox.removeAll();
    java.lang.String category = categoryComboBox.getSelectedItem().toString();
    java.lang.System.out.println(category);
    for (RestaurantObjects.MenuItem item : RestaurantObjects.Menu.menuList) {
        if (item.getCategory().equals(category)) {
            itemComboBox.addItem(item.getName());
            java.lang.System.out.println(item.getName());
        }
    }
}