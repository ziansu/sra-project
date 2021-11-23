private static boolean isCompatible(int[] startTimes, int[] finishTimes, int a1, int a2) {
    return ((startTimes[a1]) >= (finishTimes[a2])) || ((startTimes[a2]) >= (finishTimes[a1]));
}