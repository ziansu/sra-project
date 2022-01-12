@java.lang.Override
public void deleteAdvisoryMessage(eu.daiad.web.domain.application.StaticRecommendation staticRecommendation) {
    javax.persistence.TypedQuery<eu.daiad.web.domain.application.StaticRecommendation> staticRecommendationQuery = entityManager.createQuery("select s from static_recommendation s where s.id = :id", eu.daiad.web.domain.application.StaticRecommendation.class).setFirstResult(0).setMaxResults(1);
    staticRecommendationQuery.setParameter("id", staticRecommendation.getId());
    java.util.List<eu.daiad.web.domain.application.StaticRecommendation> staticRecommendations = staticRecommendationQuery.getResultList();
    if ((staticRecommendations.size()) == 1) {
        eu.daiad.web.domain.application.StaticRecommendation toBeDeleted = staticRecommendations.get(0);
        this.entityManager.remove(toBeDeleted);
    }
}