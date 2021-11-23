public void drop() {
    if (!(listenerList.isEmpty())) {
        java.util.List<T> list = findAll();
        for (T t : list) {
            remove(t);
        }
    }
    com.bugull.mongo.BuguDao.getCollection().drop();
    com.bugull.mongo.BuguDao.getCollection().dropIndexes();
}