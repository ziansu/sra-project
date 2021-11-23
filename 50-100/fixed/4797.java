public void addTime(java.lang.Long time) {
    avg = (((count.get()) * (avg)) + time) / (count.incrementAndGet());
    if (time > (max)) {
        max = time;
    }
    if (time < (min)) {
        min = time;
    }
}