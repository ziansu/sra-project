private java.lang.String genReport(org.g6.laas.server.controllers.JobController.TaskRunningResult taskRunningResult, org.g6.laas.server.database.entity.task.Task task) {
    org.g6.laas.core.engine.task.report.ReportModel model = new org.g6.laas.core.engine.task.report.ReportModel();
    model.setAttribute("task_running_result", taskRunningResult.getResult());
    org.g6.laas.core.engine.task.report.template.TemplateViewResolver resolver = new org.g6.laas.core.engine.task.report.template.TemplateViewResolver();
    org.g6.laas.core.engine.task.report.ReportBuilder builder = new org.g6.laas.core.engine.task.report.ReportBuilder(resolver);
    java.lang.String report = builder.build(model, ("/report/template/" + (task.getClassName())));
    return report;
}