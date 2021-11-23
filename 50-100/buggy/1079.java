public void setOnFire() {
    isOnFire = true;
    setFireAnimation();
    new com.mayying.tileMapGame.entities.powerups.DelayedThread(10000L) {
        @java.lang.Override
        public void run() {
            super.run();
            if ((com.mayying.tileMapGame.GameWorld.getInstance()) != null) {
                if (isOnFire) {
                    isOnFire = false;
                    die();
                }
            }
        }
    }.start();
}