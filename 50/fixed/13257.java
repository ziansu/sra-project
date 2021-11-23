@java.lang.Override
public void close() {
    if (((database) != null) && (database.isOpen()))
        database.close();
    
    database = null;
}