public void setRunning() {
    lr.start();
    btn_start.setText("STOP");
    if (isAdded()) {
        btn_start.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
    }
    btn_start.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            model.getJniCommunicator().stopCelix();
        }
    });
    btn_start.setEnabled(true);
}