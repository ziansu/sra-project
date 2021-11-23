public static void tick() {
    ants2d.mapabstractions.Clock clock = ants2d.mapabstractions.Clock.getClock();
    for (java.lang.Object x : new java.util.ArrayList<java.lang.Object>(clock.getClients().keySet())) {
        ((ants2d.mapabstractions.ChangesWithTime) (x)).timeStep();
        if (((ants2d.mapabstractions.ChangesWithTime) (x)).isOver())
            clock.remove(((ants2d.mapabstractions.ChangesWithTime) (x)));
        
    }
}