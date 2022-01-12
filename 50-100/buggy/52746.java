public static java.lang.String[] getMenuItems() {
    de.kit.irobot.util.State[] states = de.kit.irobot.util.State.values();
    java.lang.String[] menuItems = new java.lang.String[(states.length) + 1];
    for (int i = 0; i < (states.length); i++) {
        menuItems[i] = states.toString();
    }
    menuItems[states.length] = "EXIT";
    return menuItems;
}