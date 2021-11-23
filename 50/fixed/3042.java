public void actionPerformed(java.awt.event.ActionEvent e) {
    Game.MainMenu.error = true;
    Game.MainMenu.f.repaint();
    Game.World2.main(null);
    Game.MainMenu.error = false;
    Game.MainMenu.f.dispose();
}