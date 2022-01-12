private hudson.plugins.sauce_ondemand.SauceOnDemandBuildWrapper createSauceOnDemandBuildWrapper(hudson.plugins.sauce_ondemand.Credentials sauceCredentials) {
    hudson.plugins.sauce_ondemand.SeleniumInformation seleniumInformation = new hudson.plugins.sauce_ondemand.SeleniumInformation(null, null);
    return new hudson.plugins.sauce_ondemand.SauceOnDemandBuildWrapper(true, null, sauceCredentials, seleniumInformation, null, null, "-i ${BUILD_NUMBER}", null, false, false, true, null, null, false, null, false);
}