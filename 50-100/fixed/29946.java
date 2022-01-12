@java.lang.Override
public boolean attack(edu.uco.sdd.rocketdog.model.TangibleEntity target) {
    if (((hitbox) != null) && (target instanceof edu.uco.sdd.rocketdog.model.Attackable)) {
        if (hitbox.intersects(hitbox.parentToLocal(target.getHitbox().getBoundsInParent()))) {
            ((edu.uco.sdd.rocketdog.model.Attackable) (target)).damage(damage);
            return true;
        }
    }
    return false;
}