@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        java.io.File file = getSaveFile(logic.FtpClient.getFileName(listFiles.getSelectedIndex()));
        if (logic.FtpClient.retrFile(file)) {
            updateFileList();
        }else {
            file.delete();
            throw new java.io.IOException();
        }
    } catch (java.io.IOException e1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Неизвестная ошибка", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}