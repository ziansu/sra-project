@java.lang.Override
public void execute() {
    this.player.bombTimer = Bomb.TIMER_MAX;
    this.player.bombRange = Bomb.RANGE_MIN;
    final at.mgm.bbm.core.events.Player player = this.player;
    java.lang.Runnable runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                java.lang.Thread.sleep(PowerDown.DEFAULT_DURATION);
                player.bombTimer = Bomb.TIMER_DEFAULT;
                player.bombRange = Bomb.RANGE_DEFAULT;
            } catch (final java.lang.InterruptedException e) {
                e.printStackTrace();
                player.bombTimer = Bomb.TIMER_DEFAULT;
                player.bombRange = Bomb.RANGE_DEFAULT;
            }
        }
    };
    runnable.run();
    ObjectMap.INSTANCE.removeObject(this.powerDown);
}