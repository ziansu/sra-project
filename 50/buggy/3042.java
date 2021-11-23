public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("You clicked button4!");
    Game.MainMenu.error = true;
    Game.MainMenu.f.repaint();
    Game.World2.main(null);
    Game.MainMenu.error = false;
    Game.MainMenu.f.dispose();
}