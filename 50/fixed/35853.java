public static java.lang.String getTimeString(int lastKnownPosition) {
    int numOfSeconds = lastKnownPosition / 1000;
    int secsAfterModulus = numOfSeconds % 60;
    return (("" + (numOfSeconds / 60)) + (secsAfterModulus < 10 ? ":0" : ":")) + secsAfterModulus;
}