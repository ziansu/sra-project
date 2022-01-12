public void posterContainsKeyword(java.lang.String keyword) {
    java.lang.String posterText = countdownWidgetPage.getCountdownWidget().getPosterWindow().getText();
    org.junit.Assert.assertTrue(java.lang.String.format("The poster does not contains %s but has text: %s", keyword, posterText), keyword.toLowerCase().contains(posterText.toLowerCase()));
}