@java.lang.Override
public void extractValues(java.sql.ResultSet rs) throws java.sql.SQLException {
    java.lang.String customerID = null;
    _convertedWaitingList = new java.util.ArrayList();
    int numberInLine = 0;
    while (rs.next()) {
        numberInLine = rs.getInt(1);
        customerID = rs.getString(2);
        _convertedWaitingList.add(numberInLine, customerID);
    } 
    rs.close();
}