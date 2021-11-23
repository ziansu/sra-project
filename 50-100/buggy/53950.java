private void loadAll(pathfinding.ChronoGameState chrono, robot.Cinematique start) throws exceptions.MemoryManagerException, java.lang.InterruptedException {
    log.debug("Début du chargement des trajectoires…");
    java.io.File f = new java.io.File("./paths/");
    java.util.List<java.lang.String> names = new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(f.list()));
    for (java.lang.String s : names)
        loadPath(s);
    
}