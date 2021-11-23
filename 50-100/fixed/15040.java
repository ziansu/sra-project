public static java.lang.String calculateEstimate(long currentsize, long totalsize, long timestart, long timenow) {
    long timediff = timenow - timestart;
    long sizeleft = totalsize - currentsize;
    long x = (((sizeleft * timediff) / currentsize) == 0) ? 1 : currentsize;
    x = x / 1000;
    return org.jivesoftware.sparkimpl.plugin.filetransfer.transfer.ui.TransferUtils.convertSecondstoHHMMSS(java.lang.Math.round(x));
}