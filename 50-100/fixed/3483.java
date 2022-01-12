private static double getAvgOpsSec(java.util.List<java.lang.String> vmConsoleOutputLines) {
    double sumAvgOpsSec = 0.0;
    int samples = 0;
    for (java.lang.String line : vmConsoleOutputLines) {
        if (line.contains("READ AverageLatency(us)=")) {
            sumAvgOpsSec += java.lang.Double.parseDouble(line.split(";")[1].split("current")[0]);
            ++samples;
        }
    }
    if (samples == 0) {
        return -1;
    }else {
        return sumAvgOpsSec / samples;
    }
}