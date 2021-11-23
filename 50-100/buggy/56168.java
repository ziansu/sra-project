public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        for (com.capstone.plasma.mob.Mob mob : com.capstone.plasma.mob.Mob.mobs) {
            mob.tick();
        }
    } 
}