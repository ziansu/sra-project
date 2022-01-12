protected void rangedAttack(com.badlogic.gdx.math.Vector2 direction, int damage) {
    if (isStunned()) {
        return ;
    }
    if ((rangedAttackTimer) > (com.superduckinvaders.game.entity.Character.RANGED_ATTACK_COOLDOWN)) {
        rangedAttackTimer = 0.0F;
        faceAttackTimer = 0.0F;
        fireAt(direction, damage);
        lookDirection(direction.cpy().nor());
    }
}