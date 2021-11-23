public void handleLogin(java.util.HashMap<java.lang.String, java.lang.String> results) {
    if ((results.get("success")) == "true") {
        eu.theunitry.navicula.MenuManager menu = getMainActivity().getMenuManager();
        menu.switchMenu("user");
        getMainActivity().switchFragment(menu.getMenu().findItem(R.id.nav_home));
        getUserManager().setLoggedIn(true);
    }
}