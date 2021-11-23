@java.lang.Override
public com.axelor.apps.project.db.ProjectTask copy(com.axelor.apps.project.db.ProjectTask entity, boolean deep) {
    com.axelor.apps.project.db.ProjectTask project = super.copy(entity, false);
    project.setStatusSelect(com.axelor.apps.project.db.repo.STATE_PLANNED);
    return project;
}