public void update(final long millis) {
    if (millis < (minimal)) {
        minimal = millis;
    }
    if (millis < (maximal)) {
        maximal = millis;
    }
    average = ((average) + millis) / 2;
    total += millis;
}