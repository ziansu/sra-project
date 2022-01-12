@org.junit.Test
public void processMashSensor_onStepStateWithPvBiggerThanSp_startsStepTimer() {
    sensor.setPv(60.0);
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isFalse();
    me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.processMashSensor(sensor, queue, latch);
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isTrue();
}