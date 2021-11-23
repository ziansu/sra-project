private static javax.swing.JPanel getinfoTable() {
    javax.swing.JPanel containerPanel = new javax.swing.JPanel();
    GUI.SetupPanel.nextButton.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            GUI.Main.changePanel(((GUI.SetupPanel.myID) + 1));
        }
    });
    GUI.SetupPanel.prevButton.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            GUI.Main.changePanel(2);
        }
    });
    containerPanel.add(GUI.SetupPanel.prevButton);
    containerPanel.add(GUI.SetupPanel.nextButton);
    return containerPanel;
}