private void VisionaSchedaListener() {
    javax.swing.JButton visionaSchedaButton = view.getVisionaSchedaButton();
    visionaSchedaButton.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            java.lang.System.out.print(Box.getSelectedItem());
            if ((Box.getSelectedItem()) != null)
                VisionaSchedaAction();
            
        }
    });
}