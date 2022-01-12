@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object s = e.getSource();
    if (s == (viewEditReservations)) {
        new rentalcar.ui.ManagerHistory(user).setVisible(true);
    }else
        if (s == (addRemoveUsers)) {
            new rentalcar.ui.UserManagement(user).setVisible(true);
        }else
            if (s == (logout)) {
                new rentalcar.ui.LoginModule().setVisible(true);
                dispose();
            }
        
    
}