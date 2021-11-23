public void addSport(java.lang.String userNick, java.lang.String sportName) {
    es.upm.miw.apaw.p2.sport.entities.Sport sport = es.upm.miw.apaw.p2.sport.daos.DaoFactory.getFactory().getSportDao().read(sportName);
    es.upm.miw.apaw.p2.sport.entities.User user = es.upm.miw.apaw.p2.sport.daos.DaoFactory.getFactory().getUserDao().read(userNick);
    es.upm.miw.apaw.p2.sport.daos.DaoFactory.getFactory().getUserDao().addSport(user, sport);
}