private void squareClicked(de.htwg.dog.view.gui.BoardPanel.Square clickedSquare) {
    if (((selectedSquare1) == null) && (clickedSquare != (selectedSquare2))) {
        selectedSquare1 = clickedSquare;
    }else
        if ((selectedSquare1) == clickedSquare) {
            selectedSquare1 = null;
        }else
            if (((selectedSquare2) == null) && (clickedSquare != (selectedSquare1))) {
                selectedSquare2 = clickedSquare;
            }else
                if ((selectedSquare2) == clickedSquare) {
                    selectedSquare2 = null;
                }
            
        
    
    this.repaint();
}