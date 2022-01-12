@java.lang.Override
public void configure(org.orienteer.logger.IOLoggerConfiguration configuration) {
    super.configure(configuration);
    if (!(org.apache.wicket.util.string.Strings.isEmpty(collectorUrl))) {
        org.apache.wicket.request.Url url = org.apache.wicket.request.Url.parse(collectorUrl);
        if (org.apache.wicket.util.string.Strings.isEmpty(url.getPath())) {
            collectorUrl = ((collectorUrl) + (collectorUrl.endsWith("/") ? "" : "/")) + "rest/ologger";
        }
    }
}