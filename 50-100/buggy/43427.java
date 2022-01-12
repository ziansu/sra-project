BuzMo.Database.Insert insertPrivateGroupMessage(java.lang.Integer messageID, java.lang.String sender, java.lang.String message, java.lang.String timestamp, java.lang.String group_name, java.lang.Integer groupID) throws BuzMo.Database.DatabaseException {
    java.util.Vector<java.lang.String> recipients = BuzMo.Database.ChatGroupMembers.members(log, connection, group_name);
    return insert(messageID, sender, message, timestamp, groupID, null, recipients);
}