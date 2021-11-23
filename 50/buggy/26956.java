@java.lang.Override
public void cleanUp() {
    if ((db) != null)
        db.flush();
    
    executor.cancel();
}