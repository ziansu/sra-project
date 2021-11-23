public void login() {
    java.lang.System.out.println("naa tryker jeg paa login");
    user = new core.User("test", "Test");
    loginLayout.setVisible(false);
    initRootLayout();
    showList();
    showToolbar();
    showCalendar(new core.Group("", "0", new java.util.ArrayList<java.lang.String>(), new java.util.ArrayList<java.lang.String>()));
    java.lang.System.out.println("show list,toolbar,calendar happended");
}