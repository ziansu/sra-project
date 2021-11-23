private void resetFrame() {
    this.getContentPane().removeAll();
    this.c = null;
    this.setTitle("Calcudoku");
    this.validate();
    this.revalidate();
    this.pack();
    this.setLocationRelativeTo(null);
}