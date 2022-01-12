@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((travelsList.getSelectedIndex()) > (-1)) {
        new travelAgencyGUI.AddReservationFrame(agency, travelsList.getSelectedValue());
    }
}