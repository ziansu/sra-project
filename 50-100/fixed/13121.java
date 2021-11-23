public void close() {
    for (int i = 0; i < (me.philipsnostrum.bungeepexbridge.helpers.MySQL.MAX_CONNECTIONS); i++) {
        if ((me.philipsnostrum.bungeepexbridge.helpers.MySQL.connectionPool[i]) != null) {
            java.sql.Connection connection = me.philipsnostrum.bungeepexbridge.helpers.MySQL.connectionPool[i].connection;
            try {
                if ((connection != null) && (!(connection.isClosed())))
                    connection.close();
                
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
    }
}