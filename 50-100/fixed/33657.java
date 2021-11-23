private static double getAvgRequestsPerSecond(java.util.List<java.lang.String> vmConsoleOutputLines) {
    for (int i = (vmConsoleOutputLines.size()) - 1; i >= 0; --i) {
        if (vmConsoleOutputLines.get(i).startsWith("  timeDiff,     rps,")) {
            java.lang.String outputLineWithRps = vmConsoleOutputLines.get((i + 1));
            return java.lang.Double.parseDouble(outputLineWithRps.split(",")[1]);
        }
    }
    return -1;
}