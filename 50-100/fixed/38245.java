@java.lang.Override
public java.util.List<com.ppa8ball.models.Week> getAll(com.ppa8ball.models.Season season) {
    org.hibernate.Criteria cr = session.createCriteria(com.ppa8ball.models.Season.class);
    cr.add(org.hibernate.criterion.Restrictions.eq("id", season.getId()));
    com.ppa8ball.models.Season s = ((com.ppa8ball.models.Season) (cr.uniqueResult()));
    return s.getWeeks();
}