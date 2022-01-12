public java.util.List<eu.execom.labs.pomodorospringreact.entity.Pomodoro> getLastPomodorosForUser(eu.execom.labs.pomodorospringreact.entity.User user, int numberOfPomodoros, int timeFrame) {
    try {
        javax.persistence.Query query = entityManager.createNativeQuery(("SELECT * FROM Pomodoro WHERE userId = ? AND startTime >= NOW() - INTERVAL ? MINUTE" + " ORDER BY startTime DESC LIMIT ?"), eu.execom.labs.pomodorospringreact.entity.Pomodoro.class).setParameter(1, user.getId()).setParameter(2, timeFrame).setParameter(3, numberOfPomodoros);
        return ((java.util.List<eu.execom.labs.pomodorospringreact.entity.Pomodoro>) (query.getResultList()));
    } catch (javax.persistence.NoResultException e) {
        return null;
    }
}