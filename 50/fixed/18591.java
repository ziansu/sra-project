@java.lang.Override
protected void initializeOpMode() {
    super.initializeOpMode();
    this.color = io.github.thunderbots.lightning.Lightning.getSensor("color");
    this.color.enableLed(false);
    io.github.thunderbots.lightning.Lightning.getTaskScheduler().registerTask(new io.github.thunderbots.testing.ColorSensorTest.SensorDataDisplayRunnable());
}