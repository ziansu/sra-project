public void setupClient(java.lang.String ip, int port, java.lang.String pass, java.lang.String name, java.lang.String clientName) throws java.io.IOException {
    capturePane = new GUI.View.CapturePane(ip, port, pass, name, clientName, application);
    setSize(Constants.captureViewWidth, Constants.captureViewHeight);
    setTitle(Constants.captureViewTitle);
    setResizable(true);
    remove(tabbedPane);
    add(capturePane);
    revalidate();
    repaint();
}