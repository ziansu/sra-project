@org.junit.Test
public void recordString() throws java.lang.Exception {
    java.lang.String s = "Hello World!";
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("s"), org.hamcrest.CoreMatchers.equalTo(s));
}