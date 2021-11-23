@java.lang.Override
public void onPickup(com.ashenrider.game.Player player) {
    super.onPickup(player);
    player.onSpeedBoost(0.5F, com.ashenrider.game.SpeedPowerUp.BUFF_DURATION);
}