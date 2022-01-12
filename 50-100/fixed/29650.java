public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String count = javax.swing.JOptionPane.showInputDialog("Enter count:");
    if (!(count.isEmpty())) {
        for (int i = 0; i < (java.lang.Integer.parseInt(count)); ++i) {
            modelNewDBTable.addRow(new java.lang.Object[]{  });
        }
    }
}