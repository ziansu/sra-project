@org.junit.Test
public void processMashSensor_onStepStateWithPvBiggerThanSp_setsStateToSOAK() {
    sensor.setPv(60.0);
    org.assertj.core.api.Assertions.assertThat(sensor.getPv()).isGreaterThan(55.0);
    me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.processMashSensor(sensor, queue, latch);
    org.assertj.core.api.Assertions.assertThat(me.brauhaus.wbs.device.spark.command.ExecuteProfileTest.profile.getState()).isEqualTo(ActuatorState.SOAK);
}