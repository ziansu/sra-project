public void run() {
    org.caliog.myRPG.Manager.timer += 1L;
    if ((org.caliog.myRPG.Manager.timer) >= 72000)
        org.caliog.myRPG.Manager.timer = 0;
    
    org.caliog.myRPG.Manager.seconds = (org.caliog.myRPG.Manager.timer) / 20;
    if (((org.caliog.myRPG.Manager.timer) % 5L) == 0L) {
        org.caliog.myRPG.Mobs.MobSpawner.getTask().run();
        org.caliog.Villagers.NPC.Guards.GManager.doLogics();
        if (((org.caliog.myRPG.Manager.timer) % 20L) == 0L)
            org.caliog.Villagers.NPC.Util.VManager.doLogics();
        
    }
    org.caliog.myRPG.Entities.PlayerManager.task(org.caliog.myRPG.Manager.seconds);
}