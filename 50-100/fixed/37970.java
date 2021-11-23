@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    hideProgressDialog();
    if (databaseError != null) {
        new com.seblacity.pos.dialogs.CustomAlertDialog(this).setMessage(R.string.unknown_error_message).show();
    }else {
        com.seblacity.pos.utils.UIController.startActivity(this, com.seblacity.pos.activities.OrdersActivity.class, new android.content.Intent().putExtra(Globals.TABLE_ID, table.getId()));
    }
}