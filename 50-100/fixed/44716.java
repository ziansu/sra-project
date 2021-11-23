public void run() {
    java.lang.Thread threadSimulator = new java.lang.Thread(new BombSimulator.AccelerometerSimulator(match.getToken(), buffer));
    threadSimulator.start();
    while (true) {
        SleepBombManager();
        java.util.ArrayList<BombSimulator.Measurement> measurements = new java.util.ArrayList(buffer.readAllAndClean());
        if (!(measurements.isEmpty())) {
            CalculateEMA(measurements);
        }
    } 
}