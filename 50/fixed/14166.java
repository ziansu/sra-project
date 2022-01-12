@org.junit.Ignore
@org.junit.Test
public void recordBoolean() throws java.lang.Exception {
    boolean b = true;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("b"), org.hamcrest.CoreMatchers.equalTo(java.lang.Boolean.toString(b)));
}