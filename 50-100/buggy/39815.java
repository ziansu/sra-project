public java.util.ArrayList<java.lang.String> getInviteMessages() {
    java.util.ArrayList<java.lang.String> invMsg = new java.util.ArrayList<java.lang.String>();
    java.util.ArrayList<session.Invite> invites = player.getInvites();
    for (int i = 0; i < (invites.size()); i++) {
        invMsg.add(invites.get(i).getMessage());
    }
    return invMsg;
}