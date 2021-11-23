public void launchPlayer1ColorSelectScreen() {
    remove(edu.ucsb.cs56.projects.games.connectfour.startScreen2.ss);
    if ((edu.ucsb.cs56.projects.games.connectfour.startScreen2.SPMenu) != null)
        remove(edu.ucsb.cs56.projects.games.connectfour.startScreen2.SPMenu);
    
    this.setSize(edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_width, edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_height);
    this.repaint();
    edu.ucsb.cs56.projects.games.connectfour.startScreen2.p1ColorScreen = new edu.ucsb.cs56.projects.games.connectfour.Player1ColorSelectScreen(this);
    edu.ucsb.cs56.projects.games.connectfour.startScreen2.namePanel1 = new edu.ucsb.cs56.projects.games.connectfour.namePanel();
    this.getContentPane().add(java.awt.BorderLayout.NORTH, edu.ucsb.cs56.projects.games.connectfour.startScreen2.namePanel1);
    this.add(edu.ucsb.cs56.projects.games.connectfour.startScreen2.p1ColorScreen);
    this.revalidate();
    this.repaint();
}