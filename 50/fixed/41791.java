public int getSize() {
    if ((interval) == null) {
        return 0;
    }else {
        return ((int) (interval.toDuration().getStandardDays())) + 1;
    }
}