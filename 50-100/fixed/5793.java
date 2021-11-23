public synchronized void savePoints() {
    try (java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(pointsFile))) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> userAndPoints : points.entrySet())
            printWriter.println((((userAndPoints.getKey()) + " ") + (userAndPoints.getValue())));
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
        channelBot.log("Error saving points", LogLevel.WARN);
    }
}