private boolean loadAllCurrentReservations() {
    ManagerPanel mp = view.getManagerPanel();
    ViewCurrentReservationsManagerCard currentReservationsPanel = mp.getViewCurrentReservationsManagerCard();
    try {
        java.sql.ResultSet customerReservations = model.viewAllCurrentReservations();
        java.lang.Object[][] reservationArray = HotelController.getReservations(customerReservations);
        currentReservationsPanel.setReservationDetailsPane(reservationArray);
        return true;
    } catch (java.lang.Exception ex) {
        mp.setMessageLabel("Error: unable to load reservation data");
        ex.printStackTrace();
        return false;
    }
}