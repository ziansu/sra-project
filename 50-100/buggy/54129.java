public void activate() {
    final at.mgm.bbm.core.objects.gameobjects.Bomb bomb = this;
    java.lang.Runnable runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                java.lang.Thread.sleep(timerInMillis);
                new at.mgm.bbm.core.events.DetonateBomb(bomb);
            } catch (final java.lang.InterruptedException e) {
                e.printStackTrace();
                ObjectMap.INSTANCE.removeObject(bomb);
            }
        }
    };
    runnable.run();
}