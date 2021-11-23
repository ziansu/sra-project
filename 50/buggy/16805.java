public void actionPerformed(java.awt.event.ActionEvent arg0) {
    final java.io.File path = choosDirectory("Choose Directory");
    client.setPathToCertFile(path.toString());
}