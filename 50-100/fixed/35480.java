public java.lang.String getHdfsUserName(se.kth.bbc.project.Project project, se.kth.hopsworks.user.model.Users user) {
    if ((project == null) || (user == null)) {
        return null;
    }
    return ((project.getName()) + (se.kth.hopsworks.hdfsUsers.controller.HdfsUsersController.USER_NAME_DELIMITER)) + (user.getUsername());
}