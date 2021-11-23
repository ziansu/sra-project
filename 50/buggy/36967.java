public void addPoint(long timeLogged, int timeTaken) {
    add(new com.builtbroken.jlib.type.Pair<java.lang.Long, java.lang.Integer>(timeLogged, timeTaken));
    reCalculateAverage = true;
}