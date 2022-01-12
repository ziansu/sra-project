@java.lang.Override
public int inviteFriend(int inviterID, int inviteeID) {
    org.ejdb.bson.BSONObject newFriendReq = new org.ejdb.bson.BSONObject("userid1", java.lang.String.valueOf(inviterID)).append("userid2", java.lang.String.valueOf(inviteeID)).append("status", EJDBClientProperties.FRIEND_PENDING);
    org.ejdb.driver.EJDBCollection friends = src.EJDBClient.ejdb.getCollection(EJDBClientProperties.DB_COLLECTION_FRIENDS);
    friends.save(newFriendReq);
    return 0;
}