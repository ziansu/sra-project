@java.lang.Override
public void close() throws java.lang.Exception {
    while (!(db.isClosed())) {
        try {
            for (java.sql.Statement s : database.statementsToClose) {
                try {
                    s.close();
                } catch (java.lang.Exception ex) {
                }
            }
            db.close();
        } catch (java.lang.Exception ex) {
            db.close();
            java.lang.System.out.println("Db failed to close");
            java.lang.System.out.println(ex);
        }
    } 
}