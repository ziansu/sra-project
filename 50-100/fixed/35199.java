public static int getNumIterations(net.sllmdilab.t5xrefmanager.util.TimeShift.Interval master, net.sllmdilab.t5xrefmanager.util.TimeShift.Interval interval) {
    long distanceFromIntervalStart = ((interval.start) - (master.start)) % (master.length());
    if (distanceFromIntervalStart < 0) {
        distanceFromIntervalStart += master.length();
    }
    return ((int) (((interval.length()) + distanceFromIntervalStart) / (master.length())));
}