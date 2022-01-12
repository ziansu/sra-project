public void loadRulesPage() {
    this.setSize((2 * (edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_width)), ((int) (1.25 * (edu.ucsb.cs56.projects.games.connectfour.startScreen2.menu_height))));
    this.remove(edu.ucsb.cs56.projects.games.connectfour.startScreen2.ss);
    this.repaint();
    edu.ucsb.cs56.projects.games.connectfour.startScreen2.RulesMenu = new edu.ucsb.cs56.projects.games.connectfour.rulesPanel(this);
    this.add(edu.ucsb.cs56.projects.games.connectfour.startScreen2.RulesMenu);
    this.revalidate();
}