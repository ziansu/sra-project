@java.lang.Override
public void onClick(android.view.View v) {
    interactionListener.onConfirm(notifyMe.isChecked());
    buttonConfirm.setEnabled(false);
    final android.view.View buttonReset = findViewById(R.id.button_new_appointment);
    buttonReset.setVisibility(com.zyumbik.makeanappointment.custom_views.VISIBLE);
    buttonReset.setOnClickListener(new com.zyumbik.makeanappointment.custom_views.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            interactionListener.onReset();
        }
    });
}