private java.util.ArrayList<com.tiancaicc.springfloatingactionmenu.MenuItemView> generateMenuItemViews() {
    java.util.ArrayList<com.tiancaicc.springfloatingactionmenu.MenuItemView> menuItemViews = new java.util.ArrayList(mMenuItems.size());
    for (com.tiancaicc.springfloatingactionmenu.MenuItem item : mMenuItems) {
        com.tiancaicc.springfloatingactionmenu.MenuItemView menuItemView = new com.tiancaicc.springfloatingactionmenu.MenuItemView(mContext, item);
        menuItemView.setLayoutParams(com.tiancaicc.springfloatingactionmenu.Utils.createWrapParams());
        menuItemViews.add(menuItemView);
    }
    return menuItemViews;
}