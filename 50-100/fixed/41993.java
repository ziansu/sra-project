public java.lang.String viewconnection() {
    me = ((com.mylinkedin.domain.User) (this.getSession().get("me")));
    connections = userService.getConnection(me.getUid());
    notification = notificationService.listNotifications(me.getUid());
    return SUCCESS;
}