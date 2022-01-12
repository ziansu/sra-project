private void InsertDirectMessages() throws BuzMo.Database.DatabaseException {
    csv.loadCSV("privateMessages.csv");
    java.lang.String[] line;
    while ((line = csv.getNextLine()) != null) {
        java.util.Vector<java.lang.String> recipients = new java.util.Vector<>();
        recipients.add(line[2]);
        message.insertPrivateMsg(database.getNewMsg(), line[1], line[3], line[4], recipients);
        database.getNewMsg();
    } 
}