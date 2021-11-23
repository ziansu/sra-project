private void handleUserListReply(de.gigagagagigo.sagma.packets.UserListReplyPacket reply) {
    tiUsers = new javafx.scene.control.TreeItem<java.lang.String>("Users");
    tiUsers.setExpanded(true);
    if ((reply.users) != null) {
        for (java.lang.String user : reply.users) {
            tiUsers.getChildren().add(new javafx.scene.control.TreeItem<java.lang.String>(user));
        }
    }
    userTree.setRoot(tiUsers);
}