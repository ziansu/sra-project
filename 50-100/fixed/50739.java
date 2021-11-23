private void overrideConfigFromEnvironmentVariables() {
    java.lang.String ons_url_value = uk.gov.ons.dd.frontend.util.Helper.getSetting("base_url");
    if (ons_url_value != null) {
        baseURL = ons_url_value;
    }
    java.lang.String browser_value = uk.gov.ons.dd.frontend.util.Helper.getSetting("browser");
    if (browser_value != null) {
        browser = browser_value;
    }
    java.lang.String backend_value = uk.gov.ons.dd.frontend.util.Helper.getSetting("backend");
    if (backend_value != null) {
        backend = backend;
    }
}