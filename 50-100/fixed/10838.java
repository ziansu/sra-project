@java.lang.Override
public void onDisable() {
    if ((npcm) != null) {
        for (net.techcable.npclib.NPC npc : npcm.getNPCs()) {
            java.util.UUID uuid = npcm.getNPCIdFromEntity(npc.getEntity());
            despawnNPC(uuid, NpcDespawnReason.PLUGIN_DISABLED);
            if (isDebugEnabled()) {
                com.trc202.CombatTag.CombatTag.log.info(("[CombatTag] Disabling npc with ID of: " + uuid));
            }
        }
    }
    com.trc202.CombatTag.CombatTag.log.info("[CombatTag] Disabled");
}