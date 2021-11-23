public void goFaultRep(android.view.View view) {
    android.content.Intent objIntent1 = new android.content.Intent(this, com.zackoji.fault_reportmockup.FaultRepActivity.class);
    android.widget.TextView usern_textv = ((android.widget.TextView) (findViewById(R.id.username_act_main)));
    java.lang.String usernameFault = usern_textv.getText().toString();
    objIntent1.putExtra("UsernameFault", usernameFault);
    startActivity(objIntent1);
    finish();
}