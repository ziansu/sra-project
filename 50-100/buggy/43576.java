@net.citizensnpcs.command.Command(aliases = { "npc" }, usage = "despawn", desc = "Despawn an NPC", modifiers = { "despawn" }, min = 1, max = 1, permission = "npc.despawn")
public void despawnNPC(net.citizensnpcs.command.CommandContext args, org.bukkit.entity.Player player, net.citizensnpcs.api.npc.NPC npc) {
    npc.getTrait(net.citizensnpcs.api.trait.trait.Spawned.class).setSpawned(false);
    npc.despawn();
    net.citizensnpcs.util.Messaging.send(player, ((((org.bukkit.ChatColor.GREEN) + "You despawned ") + (net.citizensnpcs.util.StringHelper.wrap(npc.getName()))) + "."));
}