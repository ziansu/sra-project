@java.lang.Override
public void usePower() {
    if ((enemies) != null) {
        for (enemies.Enemy e : enemies) {
            e.setNodeArrayPos(((e.getNodeArrayPos()) - 1000));
        }
    }
    super.getCooldownObject().setOnCooldown(true);
}