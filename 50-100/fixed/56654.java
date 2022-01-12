public java.util.List<java.lang.String> getInviteMessages() {
    java.util.List<java.lang.String> invMsg = new java.util.ArrayList<java.lang.String>();
    java.util.List<session.Invite> invites = player.getInvites();
    for (int i = 0; i < (invites.size()); i++) {
        invMsg.add(invites.get(i).getMessage());
    }
    return invMsg;
}