public void run() {
    do {
        for (RacingSmiley racer : racers) {
            if (!(racer.finishedRace())) {
                racer.raceForOneTick();
            }
        }
        display.repaint();
        pause(100);
    } while (!(isRaceDone(racers)) );
}