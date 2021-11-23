@java.lang.Override
public void close() throws java.lang.Exception {
    while (!(db.isClosed())) {
        try {
            db.close();
        } catch (java.lang.Exception ex) {
            db.close();
            java.lang.System.out.println("Db failed to close");
            java.lang.System.out.println(ex);
        }
    } 
}