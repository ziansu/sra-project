public void firstPlayerTurn() {
    barierpicked = 0;
    warriorPlayed = 0;
    cardDrawn = 0;
    for (int i = 0; i < 5; i++)
        demo.PlayGui.player.hand.handgui[i].Play.setEnabled(false);
    
    javax.swing.JOptionPane.showMessageDialog(null, "you get 1 volatile power, use it wisely");
    tuto.draw();
    demo.PlayGui.player.powers.reset();
    demo.PlayGui.player.powers.token();
    this.phases.setup.removeMouseListener(this);
    this.phases.draw.removeMouseListener(this);
    this.phases.draw.addMouseListener(this);
}