@java.lang.Override
public void deleteAllData() {
    transaction(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.util.List<java.lang.Object> all = getAll();
            for (java.lang.Object entity : all) {
                delete(entity);
            }
        }
    }, false);
}