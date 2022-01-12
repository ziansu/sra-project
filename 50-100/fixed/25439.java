@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object s = e.getSource();
    if (s == (viewEditReservations)) {
    }else
        if (s == (addRemoveUsers)) {
        }else
            if (s == (logout)) {
                new rentalcar.ui.LoginModule().setVisible(true);
                dispose();
            }
        
    
}