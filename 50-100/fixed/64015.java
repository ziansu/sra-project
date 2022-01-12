private void InsertGroupMsgs() throws BuzMo.Database.DatabaseException {
    csv.loadCSV("groupMsg.csv");
    java.lang.String[] line;
    while ((line = csv.getNextLine()) != null) {
        java.lang.Integer msgID = chatGroups.getMsgId(log, connection, line[0]);
        message.insertPrivateGroupMessage(database.getNewMsg(), line[1], line[2], line[0], line[3], msgID);
    } 
}