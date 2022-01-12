@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public boolean ajoutStatut(DAO.PersonnesEntity p, DAO.StatutsEntity s) {
    boolean add = p.ajoutStatut(s);
    s.setAuteur(p);
    if (add) {
        em.merge(s);
        em.merge(p);
    }
    return add;
}