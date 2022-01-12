@java.lang.Override
public void usePower() {
    if ((enemies) != null) {
        for (enemies.Enemy e : enemies) {
            if (!((e.getNodeArrayPos()) < 1))
                e.setNodeArrayPos(((e.getNodeArrayPos()) - 500));
            
        }
    }
    super.getCooldownObject().setOnCooldown(true);
}