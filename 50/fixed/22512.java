private int showYesCancelDialog(java.lang.String title) {
    java.lang.Object[] options = new java.lang.Object[]{ "��" , "������" };
    return javax.swing.JOptionPane.showOptionDialog(frame, title, "�������� ��������", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
}