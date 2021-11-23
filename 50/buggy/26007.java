public static void scheduleRespawn(net.citizensnpcs.resources.npclib.HumanNPC npc, int delay) {
    net.citizensnpcs.resources.npclib.NPCManager.getList().remove(npc.getUID());
    new net.citizensnpcs.TickTask.RespawnTask(npc).register(delay);
}