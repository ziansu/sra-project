public void trackStartup() {
    if (!(org.opendatakit.briefcase.model.BriefcaseAnalytics.hasTrackedStartup)) {
        trackEvent("Application-Startup", null, null);
        org.opendatakit.briefcase.model.BriefcaseAnalytics.hasTrackedStartup = true;
    }
}