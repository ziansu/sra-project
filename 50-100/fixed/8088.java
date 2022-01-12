private void setupListeners() {
    queryButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent click) {
            javax.swing.JFrame popFrame = new javax.swing.JFrame();
            popFrame.setSize(250, 250);
            popFrame.setContentPane(new data.view.DynamicDataPanel(baseController, "books"));
            popFrame.setVisible(true);
        }
    });
}