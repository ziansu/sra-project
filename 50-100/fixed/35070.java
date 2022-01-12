@org.junit.Test
public void pause() throws java.lang.InterruptedException {
    org.junit.Assert.assertThat(OperatingPool.CORE.getStatus().isPaused(), org.hamcrest.CoreMatchers.is(false));
    OperatingPool.CORE.pause();
    org.junit.Assert.assertThat(OperatingPool.CORE.getStatus().isPaused(), org.hamcrest.CoreMatchers.is(true));
}