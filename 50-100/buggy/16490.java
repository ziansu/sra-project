@java.lang.Override
public void pulse() {
    super.pulse();
    (fuseTicks)--;
    if ((fuseTicks) <= 0) {
        explode();
    }else {
        world.spigot().playEffect(location.clone().add(0, 0.5, 0), Effect.SMOKE);
    }
}