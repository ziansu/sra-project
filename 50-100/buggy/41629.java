@org.junit.Test
public void processMashSensor_onStepStateWithPvBiggerThanSp_startsStepTimer() {
    sensor.setPv(60.0);
    queue.add(new me.brauhaus.wbs.domain.Step(1, "first step", 55.0, java.time.Duration.ofSeconds(1)));
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isFalse();
    me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.processMashSensor(sensor, queue, latch);
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isTrue();
}