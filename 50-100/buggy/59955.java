public int Menu() {
    java.lang.System.out.println("Select the one of the options(0-3):");
    java.lang.System.out.println(" 0. Exit");
    java.lang.System.out.println(" 1. Exchange a Lantern Card (optional) ");
    java.lang.System.out.println(" 2. Make a Dedication (optional) ");
    java.lang.System.out.println(" 3. Place a Lake Tile (mandatory) ");
    java.lang.System.out.println(" 4. Save Game ");
    java.lang.System.out.println(" 5. Load Game ");
    project.Player current_player = getPlayers().element();
    return current_player.getStrategy().inputOption(6, Strategy.Name.MAINMENU);
}