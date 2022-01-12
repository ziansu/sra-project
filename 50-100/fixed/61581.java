@java.lang.Override
public void deleteSimple(java.util.List<com.study.benchmarkorm.model.Book> books) {
    realm.beginTransaction();
    int size = books.size();
    for (int i = 0; i < size; i++) {
        com.study.benchmarkorm.model.Book book = books.get(0);
        book.removeFromRealm();
    }
    realm.commitTransaction();
}