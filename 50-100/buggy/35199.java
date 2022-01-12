public static int getNumIterations(net.sllmdilab.t5xrefmanager.util.TimeShift.Interval master, net.sllmdilab.t5xrefmanager.util.TimeShift.Interval interval) {
    long distanceFromIntervalStart = (interval.start) % (master.length());
    return ((int) (((interval.length()) + distanceFromIntervalStart) / (master.length())));
}