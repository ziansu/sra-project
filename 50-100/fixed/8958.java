public int getPartyIDFromSenderInvite(int playerID) {
    java.util.List<session.Invite> myInvites = player.getInvites();
    int partyID = 0;
    for (int i = 0; i < (myInvites.size()); i++) {
        if (playerID == (myInvites.get(i).getSenderID())) {
            partyID = myInvites.get(i).getPartyID();
            break;
        }
    }
    java.lang.System.out.println(partyID);
    return partyID;
}