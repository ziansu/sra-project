protected java.util.ArrayList<ChronoTimer.Racer> getAllRacers() {
    java.util.ArrayList<ChronoTimer.Racer> allRacers = new java.util.ArrayList<>();
    for (ChronoTimer.Racer r : queuedRacers)
        allRacers.add(r);
    
    for (java.util.Queue<ChronoTimer.Racer> q : runningLanes)
        for (ChronoTimer.Racer r : q)
            allRacers.add(r);
        
    
    for (ChronoTimer.Racer r : finishedRacers)
        allRacers.add(r);
    
    return allRacers;
}