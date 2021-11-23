public void actionPerformed(java.awt.event.ActionEvent e) {
    Blackjack.savePlayer(Blackjack.player.getMoney(), Blackjack.player.getName());
    Blackjack.frame.dispose();
}