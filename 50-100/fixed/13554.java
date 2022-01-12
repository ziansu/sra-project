private void zweitesPanelSpielBeitreten() {
    frame.setTitle("Spiel beitreten");
    frame.setSize(320, 250);
    frame.setLocationRelativeTo(null);
    beitretenPanel = new client.BeitretenPanel(this);
    frame.add(beitretenPanel);
    frame.setVisible(true);
    frame.repaint();
    frame.revalidate();
}