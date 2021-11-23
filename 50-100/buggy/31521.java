private java.util.ArrayList<java.lang.String> getStringArray(java.lang.String category) {
    java.util.ArrayList<java.lang.String> items = new java.util.ArrayList<java.lang.String>();
    for (RestaurantObjects.MenuItem item : RestaurantObjects.Menu.menuList) {
        if (item.getCategory().equals(category)) {
            items.add(item.getName());
            java.lang.System.out.println(item.getName());
        }
    }
    return items;
}