public void eliminate(com.palmergames.bukkit.towny.object.Town town, java.lang.String townBlocksFallen) {
    java.lang.String[] message = com.palmergames.bukkit.towny.TownySettings.getWarTimeEliminatedMsg((((town.getFormattedName()) + " ") + townBlocksFallen));
    com.palmergames.bukkit.towny.TownyMessaging.sendGlobalMessage(message);
}