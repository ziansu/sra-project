@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.CheckBox notifyMe = ((android.widget.CheckBox) (findViewById(R.id.checkbox_send_notifications)));
    notifyMe.setVisibility(com.zyumbik.makeanappointment.custom_views.VISIBLE);
    interactionListener.onConfirm(notifyMe.isChecked());
    buttonConfirm.setEnabled(false);
    android.view.View buttonReset = findViewById(R.id.button_new_appointment);
    buttonReset.setVisibility(com.zyumbik.makeanappointment.custom_views.VISIBLE);
    buttonReset.setOnClickListener(new com.zyumbik.makeanappointment.custom_views.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            interactionListener.onReset();
        }
    });
}