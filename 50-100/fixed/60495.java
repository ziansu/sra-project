public static void main(java.lang.String[] args) throws java.io.IOException {
    java.io.PrintWriter out = new java.io.PrintWriter("config.txt");
    Player player = new Player("SwagMaster69");
    boolean firstSetup = true;
    int counter = 0;
    player.sendName();
    while (firstSetup) {
        player.readConfig();
    } 
}