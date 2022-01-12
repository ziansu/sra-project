public code.dao.hibernatedao.Race findRaceUseInnerJOINWithTrainAndTrainTypes(int raceID) {
    org.hibernate.Query query = getCurrentSession().createQuery(code.dao.hibernatedao.RaceHibernateDao.GET_RACE_WITH_TRAIN_AND_TRAIN_TYPE_USING_ID_HQL);
    query.setInteger("id", raceID);
    code.dao.hibernatedao.Race race = ((code.dao.hibernatedao.Race) (query.uniqueResult()));
    org.hibernate.Hibernate.initialize(race.getTickets());
    org.hibernate.Hibernate.initialize(race);
    return race;
}