private void AccettaListener() {
    javax.swing.JButton AccettaButton = view.getAccettaButton();
    AccettaButton.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if ((Box.getSelectedItem()) != null)
                AccettaArchivistaAction();
            
        }
    });
}