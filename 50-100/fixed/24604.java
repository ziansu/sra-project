@java.lang.Override
public domain.Movie getMovie(long id) {
    try {
        this.openManager();
        javax.persistence.Query query = manager.createQuery("Select m from Movie m where m.id = :mid");
        query.setParameter("mid", id);
        return ((domain.Movie) (query.getSingleResult()));
    } catch (java.lang.Exception e) {
        throw new db.DBException(e.getMessage());
    } finally {
        this.closeManager();
    }
}