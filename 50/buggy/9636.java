public void addMainPageToTheMainFrame() {
    mainFrame.getContentPane().add(java.awt.BorderLayout.CENTER, buildMainPage());
    mainFrame.validate();
    try {
        java.lang.Thread.sleep(4000);
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println("bizb");
    }
}