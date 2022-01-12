public void reset() throws java.io.FileNotFoundException {
    player.setHealth(player.getMaxHealth());
    player.setHasFoundHunch(false);
    player.setRiding(false);
    player.addNewWeapon(weaponRepository.getSingleWeapon(se.chalmers.get_rect.game.entities.player.PlayerRepository.melee, player));
    player.addNewWeapon(weaponRepository.getSingleWeapon(se.chalmers.get_rect.game.entities.player.PlayerRepository.ranged, player));
}