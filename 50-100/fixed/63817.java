@java.lang.Override
public void swap() {
    java.util.LinkedList<race.Racer> startedRacers = getLane(0).getStartedRacers();
    if ((startedRacers.size()) >= 2)
        java.util.Collections.swap(startedRacers, 0, 1);
    else
        java.lang.System.out.println("Need at least 2 started racers to swap");
    
}