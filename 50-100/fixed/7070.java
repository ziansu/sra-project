@java.lang.Override
public void update() {
    if (((state) != (AbilityState.INITIALIZING)) && (initializeAnimation.isDone())) {
        projectiles.add(new animation.effects.FireballProjectile(entity, entity.getMapCollisionDetection()));
    }
    super.update();
}