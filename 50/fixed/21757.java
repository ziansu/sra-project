public long create(final com.lumens.sysdb.entity.Project project) {
    this.simplePrepareStatTransactionExecute(sqlManager.getSQL("ProjectDAO/CreateProject"), project.id, project.name, project.description, project.data);
    return project.id;
}