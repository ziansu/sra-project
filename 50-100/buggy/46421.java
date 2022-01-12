@java.lang.Override
public void handle(com.baasbox.android.BaasResult<java.util.List<com.baasbox.android.BaasLink>> resReservationLinks) {
    if (resReservationLinks.isSuccess()) {
        java.util.List<com.baasbox.android.BaasLink> reservationLinks = resReservationLinks.value();
        mGeeftReservationNumber.setText(((reservationLinks.size()) + ""));
    }else {
        showAlertDialog();
    }
}