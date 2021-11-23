private void wonGame(java.lang.String team) {
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    builder.setMessage("Start an new Game?").setTitle((team + " won!!")).setPositiveButton("yes", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            newGame();
        }
    }).setNegativeButton("no", null);
    android.support.v7.app.AlertDialog dialog = builder.create();
    dialog.show();
}