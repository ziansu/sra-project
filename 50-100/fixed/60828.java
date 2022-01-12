@java.lang.Override
public entities.User increaseRewardPoints(entities.User u, double pointsToAdd) {
    if (pointsToAdd < 0) {
        pointsToAdd = 0;
    }
    u = em.find(entities.User.class, u.getId());
    entities.Rewards r = u.getRewards();
    r.setPoints(((int) ((r.getPoints()) + pointsToAdd)));
    return u;
}