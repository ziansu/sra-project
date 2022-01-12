public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            try {
                PrisonEscape window = new PrisonEscape();
                window.frame.setVisible(true);
                window.newGame();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    });
}