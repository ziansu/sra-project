@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reaction_timer);
    preReaction();
    final android.app.AlertDialog.Builder popUp = new android.app.AlertDialog.Builder(this);
    popUp.setMessage("When prompted to go click 'CLICK!' as quickly as you can!").setPositiveButton("Play now!", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
            preReaction();
        }
    }).show();
}