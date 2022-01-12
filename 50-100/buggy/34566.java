@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.uragan.model.Game> findAllGames() {
    org.hibernate.Criteria crit = createEntityCriteria();
    crit.addOrder(org.hibernate.criterion.Order.desc("id"));
    java.util.List<com.uragan.model.Game> gameList = ((java.util.List<com.uragan.model.Game>) (crit.list()));
    for (com.uragan.model.Game game : gameList) {
        org.hibernate.Hibernate.initialize(game.getTickets());
    }
    return ((java.util.List<com.uragan.model.Game>) (crit.list()));
}