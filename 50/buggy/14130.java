public void actionPerformed(java.awt.event.ActionEvent e) {
    pnlGame.NextGeneration();
    lblGen.setText(java.lang.Integer.toString(((java.lang.Integer.parseInt(lblGen.getText())) + 1)));
}