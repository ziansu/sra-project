@java.lang.Override
public java.lang.Boolean createRoomInUserList(java.lang.Integer userId, java.lang.Integer roomId) {
    java.lang.Integer seqId = super.getIdFromSequencer("USERS_ROOMS_SEQ");
    java.lang.String query = "INSERT INTO CHAT.USERS_ROOMS VALUES (?, ?, ?)";
    commons.dao.ChatUserDaoImpl.log.info((((((((query + " [seqId=") + seqId) + ", userId=") + userId) + ", roomId=") + roomId) + "]"));
    int result = jdbcTemplate.update(query, new java.lang.Object[]{ seqId , userId , roomId });
    return result == 1 ? true : false;
}