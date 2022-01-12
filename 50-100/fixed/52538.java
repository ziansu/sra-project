@java.lang.Override
public java.util.List getProfiloUtente(java.lang.String nomeDigitato) {
    javax.persistence.Query q = em.createQuery(("SELECT p FROM Profilo p WHERE (LOWER(CONCAT(p.cognome,' ',p.nome)) LIKE :searchString) OR" + "(LOWER(CONCAT(p.nome,' ',p.cognome)) LIKE :searchString )"));
    q.setParameter("searchString", (("%" + nomeDigitato) + "%"));
    java.util.List l = q.getResultList();
    if (l.isEmpty()) {
        return null;
    }else {
        return l;
    }
}