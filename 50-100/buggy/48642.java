public long getWorkingTime() throws Tree2.src.Exceptions.BusyTaskException {
    checkBusy();
    long time = 0;
    if ((usingDate) != null) {
        for (java.util.Date[] d : usingDate) {
            time += (d[1].getTime()) - (d[0].getTime());
        }
    }
    return time;
}