private com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard getSupportDashboardMock() {
    com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard dashboard = new com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard(1, "Development", "Just what you need");
    dashboard.setWidgetConfigs(widgetConfigService.loadWidgets());
    return dashboard;
}