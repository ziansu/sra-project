@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String urlString = javax.swing.JOptionPane.showInputDialog(this, "Please input the image URL (start with protocal)");
    if (urlString == null) {
        return ;
    }
    hk.hku.cs.comp7502.worker.OpenFileWorker worker = null;
    hk.hku.cs.comp7502.ui.ImageInternalFrame imgFrame = createFrame(urlString);
    try {
        worker = new hk.hku.cs.comp7502.worker.OpenFileWorker(new java.net.URL(urlString), imgFrame);
        worker.execute();
    } catch (java.net.MalformedURLException e1) {
        javax.swing.JOptionPane.showMessageDialog(this, "The URL is not supported", "Open Image", javax.swing.JOptionPane.WARNING_MESSAGE);
        imgFrame.dispose();
        e1.printStackTrace();
    }
}