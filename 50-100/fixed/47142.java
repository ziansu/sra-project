public void updateList() {
    playerMap = app.getBoardPanel().getPlayers();
    listModel.removeAllElements();
    for (gameobjects.NewPlayer p : playerMap.values()) {
        listModel.addElement(p);
        repaint();
        app.repaint();
    }
}