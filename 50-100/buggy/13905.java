private void showRecordWeightNotification() {
    showNotification(R.string.record_weight_notification, R.drawable.ic_weight_notification, R.string.record_weight, new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.view.View recordWeight = findViewById(R.id.record_weight);
            showWeightDialog(recordWeight);
            hideNotification();
        }
    }, R.string.cancel, new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            hideNotification();
        }
    });
}