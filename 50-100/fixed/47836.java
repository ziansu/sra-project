private void checkAttack(int forPlayer) {
    Player p = players.get(forPlayer);
    Player other = players.get((forPlayer ^ 1));
    if (p.getAttackHitbox().intersects(other.getCollideable())) {
        other.onHit();
        p.landedAttack = true;
    }
}