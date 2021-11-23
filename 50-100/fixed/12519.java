private static void setVertGroup(javax.swing.GroupLayout layout, javax.swing.JScrollPane jScrollPane1, javax.swing.JScrollPane jScrollPane2, javax.swing.JLabel jLabel1, javax.swing.JLabel status, javax.swing.JTextField cmdEntry) {
    javax.swing.GroupLayout.ParallelGroup vGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
    javax.swing.GroupLayout.SequentialGroup v1 = UserInterface.UserInterface.vertGroup1(layout, jScrollPane2, jScrollPane1, status, jLabel1, cmdEntry);
    vGroup.addGroup(v1);
    layout.setVerticalGroup(vGroup);
}