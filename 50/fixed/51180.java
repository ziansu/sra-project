@play.mvc.Util
public static void setActiveProjectId(java.lang.String activeProjectId) {
    session.put(controllers.resources.ResourceController.ACTIVE_PROJECT_ID, activeProjectId);
}