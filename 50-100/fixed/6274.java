public static void start() throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, javax.swing.UnsupportedLookAndFeelException, javax.xml.parsers.ParserConfigurationException, org.codehaus.plexus.util.xml.pull.XmlPullParserException, org.xml.sax.SAXException {
    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    net.fabricmc.installer.gui.MainGui dialog = new net.fabricmc.installer.gui.MainGui();
    dialog.pack();
    dialog.setTitle("Fabric Installer");
    dialog.setLocationRelativeTo(null);
    dialog.setVisible(true);
}