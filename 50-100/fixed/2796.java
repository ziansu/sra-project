public static java.lang.String sqlID(codeu.chat.util.Uuid userID) {
    java.lang.String sqlID = "NULL";
    if (userID != null) {
        sqlID = userID.toString();
        sqlID = sqlID.replace("[UUID:", "");
        sqlID = sqlID.replace("]", "");
    }
    return sqlID;
}