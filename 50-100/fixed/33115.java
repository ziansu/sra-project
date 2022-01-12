public boolean existe(long idClient, long idLivre) {
    javax.persistence.Query q = em.createQuery(((("select OBJECT(a) from Avis a, Client c, Livre l where a.leClient.id = " + idClient) + " and a.leLivre.id = ") + idLivre));
    java.util.List<model.Livre> livre = ((java.util.List<model.Livre>) (q.getResultList()));
    return !(livre.isEmpty());
}