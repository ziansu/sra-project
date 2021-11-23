private void onFoodDelete() {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    builder.setMessage(R.string.dialog_food_delete_message);
    builder.setPositiveButton(R.string.dialog_food_delete_ok, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            deleteFood();
        }
    });
    builder.setNegativeButton(R.string.dialog_food_delete_cancel, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    });
    android.app.AlertDialog dialog = builder.create();
    dialog.show();
}