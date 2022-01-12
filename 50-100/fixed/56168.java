public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < (com.capstone.plasma.mob.Mob.mobs.size()); i++) {
            com.capstone.plasma.mob.Mob mob = com.capstone.plasma.mob.Mob.mobs.get(i);
            mob.tick();
        }
    } 
}