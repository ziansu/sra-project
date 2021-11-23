public static mainCompetition.GlobalClock getClock() {
    if ((mainCompetition.GlobalClock.gc) == null) {
        mainCompetition.GlobalClock.gc = new mainCompetition.GlobalClock();
    }else {
        return mainCompetition.GlobalClock.gc;
    }
}