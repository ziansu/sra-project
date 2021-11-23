@java.lang.Override
public java.util.List<library.ejb.persistent.Book> getBooks() {
    java.lang.System.out.println(((entityManager) + " entityManager ----------------------"));
    java.util.List<library.ejb.persistent.Book> bookList = entityManager.createQuery("from Book").getResultList();
    if (bookList == null) {
        return new java.util.ArrayList<library.ejb.persistent.Book>();
    }else {
        return bookList;
    }
}