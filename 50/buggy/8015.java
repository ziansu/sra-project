@java.lang.Override
public void close() {
    if ((tx) != null) {
        tx.commit();
    }
    cursor.close();
}