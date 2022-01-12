@java.lang.Override
public java.util.List<dk.frankbille.scoreboard.domain.Game> getAllGames() {
    org.hibernate.criterion.DetachedCriteria c = org.hibernate.criterion.DetachedCriteria.forClass(dk.frankbille.scoreboard.domain.Game.class);
    c.addOrder(org.hibernate.criterion.Order.desc("date"));
    c.addOrder(org.hibernate.criterion.Order.desc("id"));
    c.setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE);
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<dk.frankbille.scoreboard.domain.Game> result = getHibernateTemplate().findByCriteria(c);
    return result;
}