public void color(java.awt.Color bg) {
    for (javax.swing.JButton[] row : cells)
        for (javax.swing.JButton cell : row)
            logic.setColor(cell, bg);
        
    
}