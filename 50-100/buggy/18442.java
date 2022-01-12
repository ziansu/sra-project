public void ClickReject(android.view.View v) {
    android.content.Intent intent = getIntent();
    id = intent.getLongExtra("id", (-1));
    android.util.Log.d("2nd id", java.lang.String.valueOf(id));
    db.updateStatus("Rejected", id);
    android.widget.TextView tv_status = ((android.widget.TextView) (findViewById(R.id.tv_status)));
    tv_status.setText("Rejected");
    android.content.Intent refresh = new android.content.Intent(this, com.raneem.omer.jeepgas_driver.PressOrderList.class);
    startActivity(refresh);
    finish();
}