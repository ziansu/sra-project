private long computeOffset() throws java.io.IOException {
    if (org.ros.time.NtpTimeProvider.DEBUG) {
        org.ros.time.NtpTimeProvider.log.info(("Updating time offset from NTP server: " + (host.getHostName())));
    }
    org.apache.commons.net.ntp.TimeInfo time;
    try {
        time = ntpClient.getTime(host);
    } catch (java.io.IOException e) {
        org.ros.time.NtpTimeProvider.log.error(("Failed to read time from NTP server: " + (host.getHostName())), e);
        throw e;
    }
    time.computeDetails();
    return time.getOffset();
}