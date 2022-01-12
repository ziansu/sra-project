@java.lang.Override
public void cleanUp() {
    if ((db) != null)
        db.flush();
    
    if ((executor) != null)
        executor.cancel();
    
}