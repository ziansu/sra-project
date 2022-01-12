public void actionPerformed(java.awt.event.ActionEvent event) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            try {
                new group4.nevblast.NevBlastGui().setVisible(true);
            } catch (java.io.IOException ex) {
                java.util.logging.Logger.getLogger(group4.nevblast.NevBlastGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    });
}