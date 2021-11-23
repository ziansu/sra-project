private void VisionaSchedaListener() {
    if ((Box.getSelectedItem()) != null) {
        javax.swing.JButton visionaSchedaButton = view.getVisionaSchedaButton();
        visionaSchedaButton.addActionListener(new java.awt.event.ActionListener() {
            @java.lang.Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                VisionaSchedaAction();
            }
        });
    }
}