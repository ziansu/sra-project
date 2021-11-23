@java.lang.Override
public void flush() throws be.ucll.udas.domain.database.DatabaseException {
    if (manager.isOpen()) {
        manager.flush();
        disconnect();
    }
}