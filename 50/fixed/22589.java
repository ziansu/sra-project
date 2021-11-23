@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    calendar = dateComboBox.getCalendar();
    if ((calendar) == null)
        return ;
    
    setVisible(false);
}