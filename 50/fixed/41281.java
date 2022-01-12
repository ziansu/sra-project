public static void runSensor(source.Sensor s) {
    source.SourceReader sr = new source.SourceReader(source.SensorHandler.RBS, s);
    sr.start();
}