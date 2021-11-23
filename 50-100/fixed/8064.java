@java.lang.Override
public java.util.List<com.lftechnology.vyaguta.resource.entity.Contract> list(java.lang.String[] dates) {
    java.time.LocalDate pointOne = java.time.LocalDate.parse(dates[0], Constant.DATE_FORMAT_DB);
    java.time.LocalDate pointTwo = java.time.LocalDate.parse(dates[1], Constant.DATE_FORMAT_DB);
    return em.createQuery("SELECT c from Contract c WHERE c.endDate BETWEEN :pointOne AND :pointTwo order by c.endDate desc", com.lftechnology.vyaguta.resource.entity.Contract.class).setParameter("pointOne", pointOne).setParameter("pointTwo", pointTwo).getResultList();
}