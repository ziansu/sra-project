private void insertOne(java.lang.String name, Time time, int index) {
    if (index < ((times.length) - 1)) {
        insertOne(names[index], times[index], (index + 1));
        names[index] = name;
        times[index] = new Time(time);
    }
}