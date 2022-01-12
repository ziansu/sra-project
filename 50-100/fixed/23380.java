private java.util.List<org.wordpress.android.models.MenuModel> getUserMenusOnly(java.util.List<org.wordpress.android.models.MenuModel> menus) {
    java.util.ArrayList<org.wordpress.android.models.MenuModel> tmpMenus = new java.util.ArrayList();
    if (menus != null) {
        for (org.wordpress.android.models.MenuModel menu : menus) {
            if ((menu.siteId) > 0) {
                tmpMenus.add(menu);
            }
        }
    }
    return tmpMenus;
}