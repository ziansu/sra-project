private boolean geckoIsNotDisabled() {
    return (net.thucydides.core.ThucydidesSystemProperty.USE_GECKO_DRIVER.booleanFrom(environmentVariables, true)) && (geckoDriverIsOnTheClasspath());
}