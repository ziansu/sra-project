public void update() {
    if (cell.isFixed()) {
        if (cell.isInitial()) {
            this.setBackground(java.awt.Color.WHITE);
        }else {
            this.setBackground(java.awt.Color.YELLOW);
        }
        this.setFont(new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.BOLD, 40));
        this.setText(java.lang.Integer.toString(cell.getValue()));
    }else {
        repaint();
    }
}