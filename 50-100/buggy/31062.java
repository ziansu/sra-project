public void addPaymentsDialog(android.view.View view) {
    final android.app.Dialog dialog = new android.app.Dialog(getBaseContext());
    dialog.setContentView(R.layout.activity_payments_add_card_dialog);
    dialog.setTitle("Add Card");
    android.widget.Button dialogButton = ((android.widget.Button) (dialog.findViewById(R.id.addPayment)));
    dialogButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            dialog.dismiss();
        }
    });
    dialog.show();
}