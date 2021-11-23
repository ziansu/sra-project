public void listGamesInLibrary() {
    for (com.company.Game aGamesLibrary : gamesLibrary) {
        java.lang.System.out.println(aGamesLibrary);
    }
    java.lang.System.out.println("\n");
    com.company.Home home = new com.company.Home();
    home.init();
}