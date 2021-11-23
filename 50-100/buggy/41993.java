public java.lang.String viewconnection() {
    me = ((com.mylinkedin.domain.User) (this.getSession().get("me")));
    connections = userService.getConnection(me.getUid());
    for (com.mylinkedin.domain.User con : connections) {
        if (!(con.getLantitudestr().trim().isEmpty())) {
            connections.remove(con);
        }
    }
    notification = notificationService.listNotifications(me.getUid());
    return SUCCESS;
}