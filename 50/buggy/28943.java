public static void initialize() {
    theweekend.npc.NPC npc = new theweekend.npc.NPC(org.bukkit.entity.EntityType.POLAR_BEAR, theweekend.npc.HatShopNPC.npcLoc, "hatshop", true);
    NPCListener.npcs.add(npc);
    theweekend.npc.HatShopNPC.compileList();
}