@java.lang.Override
public int getUserUnreadMessagesN(int userID) {
    int messagesN = 0;
    try {
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet result = st.executeQuery(("select messageID from messages where isread = 0 and isdelete=0 and receiverID = " + userID));
        while (result.next()) {
            messagesN++;
        } 
        return messagesN;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return messagesN;
}