private static void generateDashboardHtml(int numTests, java.lang.String testEntry, java.lang.String localVideosPath, java.lang.String currentLocalPath) throws java.io.IOException {
    java.io.File dashboardHtml = new java.io.File(localVideosPath, de.zalando.tip.zalenium.util.Dashboard.DASHBOARD_FILE_NAME);
    java.lang.String dashboard = org.apache.commons.io.FileUtils.readFileToString(new java.io.File(currentLocalPath, de.zalando.tip.zalenium.util.Dashboard.DASHBOARD_TEMPLATE_FILE_NAME), java.nio.charset.StandardCharsets.UTF_8);
    dashboard = dashboard.replace("{testList}", testEntry).replace("{executedTests}", java.lang.String.valueOf(numTests));
    org.apache.commons.io.FileUtils.writeStringToFile(dashboardHtml, dashboard, java.nio.charset.StandardCharsets.UTF_8);
}