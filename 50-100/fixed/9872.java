@org.junit.Test
public void whenSpeedBelow10KmItHasExpressData() {
    org.highway.whatsup.data.physics.SpeedMeter.Progression progressionSpeed = actionCreator.getProgression(2);
    org.hamcrest.MatcherAssert.assertThat(progressionSpeed, org.hamcrest.CoreMatchers.is(SpeedMeter.Progression.LOW_SPEED));
    org.highway.whatsup.domain.data.ExpressData expressData = actionCreator.getExpressWayData(2, lat, lng, progressionSpeed);
    org.hamcrest.MatcherAssert.assertThat(expressData, org.hamcrest.CoreMatchers.notNullValue());
    org.hamcrest.MatcherAssert.assertThat(expressData.getCctvUrl(), org.hamcrest.CoreMatchers.notNullValue());
    org.hamcrest.MatcherAssert.assertThat(expressData.getMsg(), org.hamcrest.CoreMatchers.notNullValue());
}