@org.junit.Test
public void recordConsecutiveDeclarations() {
    java.lang.String inner = "inner";
    java.lang.String inner2 = "inner2";
    org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("inner"), org.hamcrest.CoreMatchers.equalTo(inner));
    org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("inner2"), org.hamcrest.CoreMatchers.equalTo(inner2));
}