@java.lang.Override
public entities.User increaseRewardPoints(entities.User u, double pointsToAdd) {
    if (pointsToAdd < 10) {
        pointsToAdd = 10;
    }
    u = em.find(entities.User.class, u.getId());
    entities.Rewards r = u.getRewards();
    r.setPoints(((int) ((r.getPoints()) + pointsToAdd)));
    return u;
}