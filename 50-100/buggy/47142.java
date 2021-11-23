public void updateList() {
    playerMap = app.getBoardPanel().getPlayers();
    listModel.removeAllElements();
    for (gameobjects.NewPlayer p : playerMap.values()) {
        listModel.addElement(p);
        java.lang.System.out.println((("element: " + p) + ", was added to list"));
        repaint();
    }
    repaint();
    app.repaint();
}