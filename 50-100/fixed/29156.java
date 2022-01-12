public void run() {
    try {
        javax.swing.JFrame frame = new javax.swing.JFrame("ListDemo");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        javax.swing.JComponent newContentPane = new edu.usc.ict.nl.ui.chat.ISinspector(dm);
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}