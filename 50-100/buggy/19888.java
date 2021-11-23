@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    tableLayout.removeAllViews();
    tvGrandTotal.setText("");
    tvGrandTotalComm.setText("");
    android.widget.TextView TvAgentId = ((android.widget.TextView) (findViewById(R.id.txt_agent_id)));
    pDialog = new android.app.ProgressDialog(this);
    pDialog.setMessage("Sending Order...Please wait!");
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(true);
    pDialog.show();
}