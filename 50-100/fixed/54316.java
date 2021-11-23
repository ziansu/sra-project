private void checkIfSquareIsClicked(java.awt.event.MouseEvent e, java.util.List<de.htwg.dog.view.gui.BoardPanel.Square> squareList) {
    for (de.htwg.dog.view.gui.BoardPanel.Square square : squareList) {
        if ((square.contains(e.getX(), e.getY())) && ((e.getButton()) == 1)) {
            squareClicked(square);
        }
    }
}