private void clear() {
    getTabs().removeAll();
    java.lang.String text = "";
    javax.swing.JPanel panel = new javax.swing.JPanel(false);
    javax.swing.JLabel filler = new javax.swing.JLabel(text);
    filler.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    panel.setLayout(new java.awt.GridLayout(1, 1));
    panel.add(filler);
    getTabs().addTab(MaeStrings.NO_TASK_IND, panel);
    add(getTabs(), java.awt.BorderLayout.CENTER);
}