public int showDialog() {
    try {
        this.validate();
        this.repaint();
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                setVisible(true);
            }
        });
        return returnValue;
    } catch (java.lang.Exception e) {
        gui.ShadyMessageDialog.LOGGER.severe("Error in showing message dialog!");
        e.printStackTrace();
        return -1;
    }
}