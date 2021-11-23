@java.lang.Override
public void close() {
    try {
        super.close();
        if ((connection) != null)
            connection.close();
        
        connection = null;
        if ((xa_connection) != null)
            xa_connection.close();
        
        xa_connection = null;
    } catch (java.lang.Exception e) {
        throw new virtuoso.jena.driver.JenaException(e);
    }
}