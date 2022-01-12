public java.lang.String getHdfsUserName(se.kth.bbc.project.Project project, se.kth.hopsworks.user.model.Users user) {
    if ((project == null) || (user == null)) {
        return null;
    }
    se.kth.hopsworks.hdfsUsers.controller.HdfsUsersController.logger.log(java.util.logging.Level.SEVERE, (("--------{0}" + (se.kth.hopsworks.hdfsUsers.controller.HdfsUsersController.USER_NAME_DELIMITER)) + "{1}"), new java.lang.Object[]{ project.getName() , user.getUsername() });
    return ((project.getName()) + (se.kth.hopsworks.hdfsUsers.controller.HdfsUsersController.USER_NAME_DELIMITER)) + (user.getUsername());
}