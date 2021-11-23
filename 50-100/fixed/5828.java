@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int numberOfApplicationsArchived = theModel.archiveApplications(containingFrame, new java.sql.Timestamp(((java.util.Date) (model1.getValue())).getTime()));
    javax.swing.JOptionPane.showMessageDialog(containingFrame, (numberOfApplicationsArchived + " old applications successfully archived"));
}