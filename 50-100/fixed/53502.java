@java.lang.Override
public com.taobao.rigel.rap.project.bo.Action getAction(long id, java.lang.String ver, int projectId) {
    com.taobao.rigel.rap.workspace.bo.CheckIn check = workspaceDao.getVersion(projectId, ver);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    com.taobao.rigel.rap.project.bo.Project p = gson.fromJson(check.getProjectData(), com.taobao.rigel.rap.project.bo.Project.class);
    return p.findAction(id);
}