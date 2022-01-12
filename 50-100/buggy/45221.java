@org.junit.Test
public void resume() throws java.lang.InterruptedException {
    org.junit.Assert.assertThat(OperatingPool.CORE.getStatus().isPaused(), org.hamcrest.CoreMatchers.is(false));
    OperatingPool.CORE.pause();
    OperatingPool.CORE.resume();
    java.lang.Thread.sleep(6000);
    org.junit.Assert.assertThat(OperatingPool.CORE.getStatus().isPaused(), org.hamcrest.CoreMatchers.is(false));
}