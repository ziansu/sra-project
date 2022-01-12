public void actionPerformed(java.awt.event.ActionEvent e) {
    Game.MainMenu.f.repaint();
    Settings.Settings.chi = !(Settings.Settings.chi);
    Settings.Settings.Changed();
    Game.MainMenu.b5.setText(("Chi: " + (Settings.Settings.chi)));
}