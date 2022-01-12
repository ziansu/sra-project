public java.lang.String runtime() {
    java.lang.management.RuntimeMXBean runtime = java.lang.management.ManagementFactory.getRuntimeMXBean();
    long millis = runtime.getUptime();
    long second = (millis / 1000) % 60;
    long minute = (millis / (1000 * 60)) % 60;
    long hour = (millis / ((1000 * 60) * 60)) % 24;
    return java.lang.String.format("%02d:%02d:%02d", hour, minute, second);
}