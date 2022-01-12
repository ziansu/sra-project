public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String command = e.getActionCommand();
    java.lang.String[] coordinates = command.split(",");
    int x = java.lang.Integer.parseInt(coordinates[0]);
    int y = java.lang.Integer.parseInt(coordinates[1]);
    playUser(x, y);
    playAI();
}