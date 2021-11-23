@java.lang.Override
public java.util.List<ch.heigvd.amt.gamification.model.entities.EndUser> findEndUsersAndPaginate(ch.heigvd.amt.gamification.model.entities.Application app, int index, int limit) throws ch.heigvd.amt.gamification.services.dao.GamificationDomainEntityNotFoundException {
    return em.createNamedQuery("Application.findEndUsers").setParameter("idApplication", app.getId()).setFirstResult(index).setMaxResults(limit).getResultList();
}