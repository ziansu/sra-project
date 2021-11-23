public static void removeMedal(org.bukkit.entity.Player player, java.lang.Boolean outsideStand) {
    if (com.martoph.martophsmedals.MartophsMedals.currentPlayerOwnedPlates.containsKey(player)) {
        player.eject();
        com.martoph.martophsmedals.MartophsMedals.currentPlayerOwnedPlates.get(player).remove();
        com.martoph.martophsmedals.MartophsMedals.currentPlayerOwnedPlates.remove(player);
    }
    if ((com.martoph.martophsmedals.MartophsMedals.currentOutsideVisiblePlates.containsKey(player)) && outsideStand) {
        com.martoph.martophsmedals.MartophsMedals.currentOutsideVisiblePlates.get(player).remove();
        com.martoph.martophsmedals.MartophsMedals.currentOutsideVisiblePlates.remove(player);
    }
}