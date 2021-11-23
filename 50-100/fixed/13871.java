@org.junit.Test
public void shouldAbleToPushHistory() throws java.lang.Exception {
    preferencesManager.pushHistory("testfile");
    java.util.List<java.lang.String> recentHistory = preferencesManager.getRecentHistory();
    org.junit.Assert.assertThat(recentHistory.size(), org.hamcrest.CoreMatchers.is(1));
    org.junit.Assert.assertThat(recentHistory, hasItem("testfile"));
}