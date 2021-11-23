private java.lang.String getBooksByGenre(java.lang.String genre_id) {
    org.hibernate.Session ORMSession = library.HibernateUtil.getSessionFactory().openSession();
    org.hibernate.Query query = ORMSession.createSQLQuery(("select name from book where genre_id = " + genre_id));
    java.util.List result = query.list();
    java.lang.String returnString = "";
    for (java.lang.Object book_name : result) {
        returnString += book_name + "; ";
    }
    return returnString;
}