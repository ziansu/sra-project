public void onClick(android.content.DialogInterface dialog, int id) {
    alertDialogBuilder.setCancelable(true);
    android.content.Intent intent = new android.content.Intent(getActivity(), droidahmed.com.jm3eia.start.MainActivity.class);
    startActivity(intent);
}