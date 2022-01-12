public void actionPerformed(java.awt.event.ActionEvent event) {
    java.lang.Object action = event.getSource();
    if (action == start) {
        java.lang.System.out.println("Go to setup screen");
        frame.setVisible(false);
    }
    if (action == leader) {
        java.lang.System.out.println("Go to leaderboard");
        frame.setVisible(false);
    }
    if (action == exit)
        java.lang.System.exit(0);
    
}