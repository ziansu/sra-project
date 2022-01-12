@java.lang.Override
public void usePower() {
    if ((enemies) != null) {
        for (enemies.Enemy e : enemies) {
            e.setNodeArrayPos(((e.getNodeArrayPos()) - 500));
            if ((e.getNodeArrayPos()) <= 0)
                e.setNodeArrayPos(0);
            
        }
    }
    super.getCooldownObject().setOnCooldown(true);
}