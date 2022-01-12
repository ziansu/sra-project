public static play.mvc.Result runSnapshot(java.lang.String snapshotId) throws java.lang.Exception {
    org.ats.jmeter.models.JMeterScript snapshot = controllers.test.JMeterScriptHelper.getJMeterScriptById(snapshotId);
    models.test.TestProjectModel project = controllers.test.TestProjectHelper.getProjectById(snapshot.getString("project_id"));
    if (project == null) {
        return redirect(routes.PerformanceController.index());
    }
    controllers.test.TestController.run(project, snapshot.getString("_id"));
    return redirect(routes.PerformanceController.index());
}