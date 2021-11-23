@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((travelsList.getSelectedIndex()) > 0) {
        new travelAgencyGUI.AddReservationFrame(agency, travelsList.getSelectedValue());
    }
}