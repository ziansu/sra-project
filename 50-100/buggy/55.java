private void AccettaListener() {
    if ((Box.getSelectedItem()) != null) {
        javax.swing.JButton AccettaButton = view.getAccettaButton();
        AccettaButton.addActionListener(new java.awt.event.ActionListener() {
            @java.lang.Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                AccettaArchivistaAction();
            }
        });
    }
}