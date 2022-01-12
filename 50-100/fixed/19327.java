public static void die() {
    com.hotmail.kalebmarc.textfighter.main.Ui.popup("You have died! You lost half of your coins. ", "You've died!", javax.swing.JOptionPane.WARNING_MESSAGE);
    com.hotmail.kalebmarc.textfighter.player.Coins.set((-((com.hotmail.kalebmarc.textfighter.player.Coins.get()) / 2)), true);
    Stats.kills = 0;
    com.hotmail.kalebmarc.textfighter.player.Health.set(com.hotmail.kalebmarc.textfighter.player.Health.getOutOf());
    com.hotmail.kalebmarc.textfighter.main.Enemy.get().setHealth(com.hotmail.kalebmarc.textfighter.main.Enemy.get().getHealthMax(), com.hotmail.kalebmarc.textfighter.main.Enemy.get().getHealthMax());
    (com.hotmail.kalebmarc.textfighter.player.Health.timesDied)++;
}