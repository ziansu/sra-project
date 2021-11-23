public synchronized javax.swing.JDialog getInspector() {
    org.opensourcephysics.media.core.PerspectiveFilter.Inspector myInspector = inspector;
    if (myInspector == null) {
        myInspector = new org.opensourcephysics.media.core.PerspectiveFilter.Inspector();
    }
    if ((myInspector.isModal()) && ((vidPanel) != null)) {
        frame = javax.swing.JOptionPane.getFrameForComponent(vidPanel);
        myInspector.setVisible(false);
        myInspector.dispose();
        myInspector = new org.opensourcephysics.media.core.PerspectiveFilter.Inspector();
    }
    inspector = myInspector;
    inspector.initialize();
    return inspector;
}