public static play.mvc.Result runProject(java.lang.String projectId) throws java.lang.Exception {
    models.test.TestProjectModel project = controllers.test.TestProjectHelper.getProjectById(projectId);
    org.ats.jmeter.models.JMeterScript snapshot = controllers.test.JMeterScriptHelper.getLastestCommit(project.getId());
    controllers.test.TestController.run(project, snapshot.getString("_id"));
    return redirect(routes.PerformanceController.index());
}