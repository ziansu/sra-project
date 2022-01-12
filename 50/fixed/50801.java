public int getFastestLapRound() {
    return (lapTimes.indexOf(java.util.Collections.min(lapTimes))) + 1;
}