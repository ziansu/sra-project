@org.junit.Test
public void testCTor() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    jmri.jmrit.symbolicprog.CvTableModel tm = new jmri.jmrit.symbolicprog.CvTableModel(new javax.swing.JLabel(), null);
    jmri.jmrit.symbolicprog.JmriJFrame jf = new jmri.jmrit.symbolicprog.JmriJFrame("test generic import");
    jmri.jmrit.symbolicprog.GenericImportAction t = new jmri.jmrit.symbolicprog.GenericImportAction("Test Action", tm, jf, new javax.swing.JLabel(), "", "", "");
    org.junit.Assert.assertNotNull("exists", t);
    jf.dispose();
}