public boolean add(java.lang.String name, Time time) {
    if (time.isBigger(times[((times.length) - 1)])) {
        return false;
    }else {
        for (int i = 0; i < (times.length); i++) {
            if (time.isBigger(times[i])) {
                insertOne(name, time, i);
                return true;
            }
        }
        return true;
    }
}