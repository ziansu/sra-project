com.epam.ta.reportportal.demo_data.DemoDataRs generate(com.epam.ta.reportportal.demo_data.DemoDataRq rq, java.lang.String project, java.lang.String user) {
    com.epam.ta.reportportal.demo_data.DemoDataRs demoDataRs = new com.epam.ta.reportportal.demo_data.DemoDataRs();
    final java.util.List<java.lang.String> launches = demoLaunchesService.generateDemoLaunches(rq, user, project);
    demoDataRs.setLaunches(launches);
    if (rq.isCreateDashboard()) {
        com.epam.ta.reportportal.database.entity.Dashboard demoDashboard = demoDashboardsService.createDemoDashboard(rq, user, project);
        demoDataRs.setDashboards(java.util.Collections.singletonList(demoDashboard.getId()));
    }
    return demoDataRs;
}