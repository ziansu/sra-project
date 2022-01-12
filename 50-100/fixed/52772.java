@org.junit.Test
public void testCTor() throws java.io.IOException {
    java.lang.String s = "CV 1      0\n" + ("CV 2      1\n" + "Index: CV31=5,.(CV32=10).\n");
    java.io.File f = makeTempFile(s);
    jmri.jmrit.symbolicprog.CvTableModel tm = new jmri.jmrit.symbolicprog.CvTableModel(new javax.swing.JLabel(), null);
    jmri.jmrit.symbolicprog.LokProgImporter t = new jmri.jmrit.symbolicprog.LokProgImporter(f, tm);
    org.junit.Assert.assertNotNull("exists", t);
}