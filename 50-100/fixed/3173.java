public void buck() {
    if ((horse) == null) {
        return ;
    }
    final org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (horse.getPassenger()));
    if (player != null) {
        horse.eject();
        player.setHealth(((player.getHealth()) - ((player.getHealthScale()) / 10)));
    }
}