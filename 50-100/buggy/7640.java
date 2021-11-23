@java.lang.Override
public int CreateFriendship(int friendid1, int friendid2) {
    org.ejdb.bson.BSONObject friendRecord = new org.ejdb.bson.BSONObject("userid1", java.lang.String.valueOf(friendid1));
    friendRecord.append("userid2", java.lang.String.valueOf(friendid2)).append("status", EJDBClientProperties.FRIEND_CONFIRMED);
    org.ejdb.bson.types.ObjectId recordID = src.EJDBClient.friends.save(friendRecord);
    src.EJDBClient.friends.commitTransaction();
    return 0;
}