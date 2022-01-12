@java.lang.Override
public boolean setDeadline(long projID, java.lang.String projDeadline) {
    com.app.izhang.sideminder.model.Project project = com.app.izhang.sideminder.model.Project.findById(com.app.izhang.sideminder.model.Project.class, projID);
    if (project == null)
        return false;
    
    java.util.Date date = new java.util.Date(projDeadline);
    project.setDueDate(date);
    project.save();
    return true;
}