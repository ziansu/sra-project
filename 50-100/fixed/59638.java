@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        android.widget.Toast.makeText(this, "Successfully updated your favorites teams", Toast.LENGTH_SHORT).show();
    }else {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage("Sorry, Please try again");
        builder.setTitle("Opps , error saving favourite teams");
        builder.setPositiveButton(android.R.string.ok, null);
        android.app.AlertDialog dialog = builder.create();
        dialog.show();
    }
}