public int showDialog() {
    try {
        this.validate();
        this.repaint();
        this.setVisible(true);
        return returnValue;
    } catch (java.lang.Exception e) {
        gui.ShadyMessageDialog.LOGGER.severe("Error in showing message dialog!");
        e.printStackTrace();
        return -1;
    }
}