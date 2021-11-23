public void embeddedCodeContainsStoredOrientation() {
    java.lang.String embeddedOrientationValue = countdownWidgetPage.getCountdownWidget().getEmbeddedOrientation();
    java.lang.String orientationValue = ((java.lang.String) (net.serenitybdd.core.Serenity.getCurrentSession().get("orientation")));
    org.junit.Assert.assertTrue(java.lang.String.format("The embedded code orientation value is: %s but the orientation value which was stored before is: %s ", embeddedOrientationValue, orientationValue), embeddedOrientationValue.equalsIgnoreCase(orientationValue));
}