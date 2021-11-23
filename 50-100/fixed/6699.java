public void loadSettingsPage() {
    this.setSize(edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_width, edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_height);
    this.remove(edu.ucsb.cs56.projects.games.connectfour.startScreen2.ss);
    this.repaint();
    edu.ucsb.cs56.projects.games.connectfour.startScreen2.settingsMenu = new edu.ucsb.cs56.projects.games.connectfour.settingsPanel(this);
    this.add(edu.ucsb.cs56.projects.games.connectfour.startScreen2.settingsMenu);
    this.revalidate();
    this.repaint();
}