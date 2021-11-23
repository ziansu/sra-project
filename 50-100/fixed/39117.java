public void run() {
    try {
        new org.words.test.WordMaster();
        javax.swing.JFrame frame = new javax.swing.JFrame("WordMaster");
        frame.setDefaultCloseOperation(2);
        javax.swing.JPanel jPanel = new org.words.gui.WordMasterView();
        frame.add(jPanel);
        frame.pack();
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
    }
}