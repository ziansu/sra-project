public mum.edu.models.Movie getMovie(int id) {
    tx.begin();
    javax.persistence.Query query = em.createQuery("SELECT a FROM Movie a WHERE a.id = :id");
    query.setParameter("id", id);
    mum.edu.models.Movie movie = ((mum.edu.models.Movie) (query.getSingleResult()));
    tx.commit();
    return movie;
}