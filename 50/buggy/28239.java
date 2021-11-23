@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    player.pauseGame = !(player.pauseGame);
    Zombie.pauseGame = player.pauseGame;
    java.lang.System.out.println(player.pauseGame);
}