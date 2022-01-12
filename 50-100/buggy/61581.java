@java.lang.Override
public void deleteSimple(java.util.List<com.study.benchmarkorm.model.Book> books) {
    realm.beginTransaction();
    for (int i = 0; i < (books.size()); i++) {
        com.study.benchmarkorm.model.Book book = books.get(i);
        book.removeFromRealm();
    }
    realm.commitTransaction();
}