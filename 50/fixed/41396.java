public services.MenuItem getMenuAtIndex(int index) {
    if ((menuItems.size()) > index) {
        return menuItems.get(index);
    }
    return null;
}