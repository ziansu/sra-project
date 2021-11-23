@java.lang.Override
protected void updateItem(program.Booking t, boolean bln) {
    super.updateItem(t, bln);
    if (t != null) {
        setText((((((t.getBookingID()) + " ") + (connection.getCustomer(t.getCustomerId()).getFullName())) + " ") + (program.convertTimeToString(t.getStartTime()))));
    }else {
        listviewEmployees.setPlaceholder(new javafx.scene.control.Label("No Bookings"));
    }
}