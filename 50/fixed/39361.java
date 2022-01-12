@java.lang.Override
public void deleteAllData() {
    java.util.List<java.lang.Object> all = getAll();
    for (java.lang.Object entity : all) {
        delete(entity);
    }
}