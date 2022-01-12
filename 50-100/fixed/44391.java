@org.junit.Test
public void processMashSensor_onRAMPandSpReached_startsTimer() {
    me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.setState(ActuatorState.RAMP);
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isFalse();
    me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.processMashSensor(sensor, queue, latch);
    org.assertj.core.api.Assertions.assertThat(queue.peek().isStarted()).isTrue();
}