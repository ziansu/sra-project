public boolean checkUser(final android.content.Context context) {
    if ((Data.user) == null) {
        new android.support.v7.app.AlertDialog.Builder(context).setTitle("Hello Guest").setMessage("Please log in!").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
            @java.lang.Override
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.content.Intent goBack = new android.content.Intent(context, itsjustaaron.food.Welcome.class);
                context.startActivity(goBack);
                finish();
            }
        }).show();
        return false;
    }
    return true;
}