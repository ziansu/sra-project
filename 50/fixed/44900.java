public org.springframework.web.servlet.ModelAndView getView(org.labkey.workflow.WorkflowController.WorkflowTaskForm form, org.springframework.validation.BindException errors) throws java.lang.Exception {
    return new org.labkey.api.view.JspView("/org/labkey/workflow/view/workflowTask.jsp", new org.labkey.workflow.model.WorkflowTask(form.getTaskId()), errors);
}