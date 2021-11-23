public static void learn(org.bukkit.entity.Player player, java.lang.String text, java.lang.Object... args) {
    if ((((player != null) && (!(one.lindegaard.MobHunting.compatibility.CitizensCompat.isNPC(player)))) && (one.lindegaard.MobHunting.MobHunting.getPlayerSettingsmanager().getPlayerSettings(player).isLearningMode())) && (!(one.lindegaard.MobHunting.Messages.isEmpty(text))))
        one.lindegaard.MobHunting.Messages.playerBossbarMessage(player, text, args);
    
}