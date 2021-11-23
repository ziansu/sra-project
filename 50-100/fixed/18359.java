@java.lang.Override
public void loop() {
    telemetry.addData("first", lastReading[0]);
    telemetry.addData("second", lastReading[1]);
    telemetry.addData("third", lastReading[2]);
    telemetry.addLine().addData("test", "\u263a\u263a\u263a").addData("test2", 2);
}