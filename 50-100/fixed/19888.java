@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    tableLayout.removeAllViews();
    tvGrandTotal.setText("");
    tvGrandTotalComm.setText("");
    android.widget.TextView TvAgentId = ((android.widget.TextView) (findViewById(R.id.txt_agent_id)));
    pDialog = android.app.ProgressDialog.show(this, "", "Sending Order...Please wait!");
}