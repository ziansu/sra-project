public void activate() {
    final at.mgm.bbm.core.objects.gameobjects.Bomb bomb = this;
    new java.lang.Thread(new java.lang.Runnable() {
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
    }).start();
}