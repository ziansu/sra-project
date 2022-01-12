@java.lang.Override
protected me.legopal92.gamblr.listeners.Prompt acceptValidatedInput(me.legopal92.gamblr.listeners.ConversationContext conversationContext, boolean b) {
    org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (conversationContext.getForWhom()));
    me.legopal92.gamblr.npc.NPCDealer dealer = ((me.legopal92.gamblr.npc.NPCDealer) (CustomEntityType.NPCDEALER.spawn(player.getLocation())));
    dealer.setCustomName(org.bukkit.ChatColor.translateAlternateColorCodes('&', name));
    dealer.setGUI(mm);
    return Prompt.END_OF_CONVERSATION;
}