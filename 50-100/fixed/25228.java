public static synchronized void delete(objects.databaseObjects.Advancement advancement) {
    if ((advancement == null) || ((advancement.getId()) < 1)) {
        return ;
    }
    try {
        synchronized(objects.objectLogic.LogicAdvancement.lock) {
            if (objects.objectLogic.LogicAdvancement.deleteAdvancement(advancement.getId())) {
                objects.objectLogic.LogicAdvancement.lock.wait(MySqlConnector.WAIT_TIME);
            }
        }
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}