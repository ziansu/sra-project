public long getWorkingTime() throws server.src.Exceptions.BusyTaskException {
    checkBusy();
    long time = 0;
    for (java.util.Date[] d : usingDate) {
        time += (d[1].getTime()) - (d[0].getTime());
    }
    return time;
}