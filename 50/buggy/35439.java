public void start_payment_activity(java.lang.String recipient_info, java.lang.String amount, java.lang.String note) {
    android.content.Intent venmoIntent = com.example.h.mogo.VenmoLibrary.openVenmoPayment("2843", "Mogo", recipient_info, amount, note, "pay");
    startActivityForResult(venmoIntent, 1);
    return ;
}