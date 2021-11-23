public services.MenuItem getMenuAtIndex(int index) {
    if (index > (menuItems.size())) {
        return menuItems.get(index);
    }
    return null;
}