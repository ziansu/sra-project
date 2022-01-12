private void insertOne(java.lang.String name, Time time, int index) {
    if (index < (times.length)) {
        insertOne(names[(index + 1)], times[(index + 1)], (index + 1));
        names[index] = name;
        times[index] = new Time(time);
    }
}