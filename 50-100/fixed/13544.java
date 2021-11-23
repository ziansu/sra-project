public void runAlgo() {
    tools.println("------SUCHE SHORTEST PFAD:");
    algo = new PathFinderAlgo(tools, suchType);
    long startTime = java.lang.System.currentTimeMillis();
    algo.suche(start, ziel);
    tools.println(("Pfad gefunden in: " + ((java.lang.System.currentTimeMillis()) - startTime)));
    printPfad();
    tools.showMessage("Weg gefunden");
}