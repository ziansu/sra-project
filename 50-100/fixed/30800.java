public java.util.Optional<nu.yona.server.goals.entities.Goal> getPreviousVersionOfThisGoal() {
    if ((previousInstanceOfThisGoal) == null) {
        return java.util.Optional.empty();
    }
    if ((previousInstanceOfThisGoal) instanceof org.hibernate.proxy.HibernateProxy) {
        return java.util.Optional.of(((nu.yona.server.goals.entities.Goal) (((org.hibernate.proxy.HibernateProxy) (previousInstanceOfThisGoal)).getHibernateLazyInitializer().getImplementation())));
    }
    return java.util.Optional.of(previousInstanceOfThisGoal);
}