private void zweitesPanelSpielBeitreten() {
    frame.setTitle("Spiel beitreten");
    frame.setSize(320, 250);
    frame.setLocationRelativeTo(null);
    beitretenPanel = new client.BeitretenPanel(this);
    frame.add(beitretenPanel);
    frame.setVisible(true);
    beitretenPanel.zuSpielAnzeigeHinzufuegen(2, 1, 4711, "TestGame1");
    beitretenPanel.zuSpielAnzeigeHinzufuegen(5, 3, 4712, "TestGame2");
    frame.repaint();
    frame.revalidate();
}