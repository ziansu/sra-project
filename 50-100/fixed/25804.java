public static void tick() {
    ants2d.mapabstractions.Clock clock = ants2d.mapabstractions.Clock.getClock();
    for (ants2d.mapabstractions.ChangesWithTime x : new java.util.ArrayList<ants2d.mapabstractions.ChangesWithTime>(clock.getClients().keySet())) {
        x.timeStep();
        if (x.isOver())
            clock.remove(x);
        
    }
}