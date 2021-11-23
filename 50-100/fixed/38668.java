@java.lang.Override
public void run() {
    final com.github.kkysen.supersmashbros.core.Hitbox hitbox = temp.newHitbox(this, 50.0F, 50.0F);
    hitbox.angle = angle;
    if (facingRight) {
        hitbox.position.add(20.0F, 0.0F);
    }else {
        hitbox.position.add((-20.0F), 0.0F);
    }
    state.addHitbox(hitbox);
}