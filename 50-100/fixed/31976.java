public static void main(java.lang.String[] args) {
    com.kamaia.cupsyballs.gui.GameWindow gw = new com.kamaia.cupsyballs.gui.GameWindow(80, 40);
    com.kamaia.cupsyballs.gui.menus.MainMenu mm = new com.kamaia.cupsyballs.gui.menus.MainMenu(gw);
    java.lang.System.out.println(("Game Running at: " + (java.lang.System.currentTimeMillis())));
    mm.run();
}