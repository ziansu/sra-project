public static void shutdown() {
    model.DBManager.sessionFactory.close();
    model.DBManager.lock.unlock();
}