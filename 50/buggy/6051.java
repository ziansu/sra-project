public void onClick(android.content.DialogInterface dialog, int which) {
    progressDialog.dismiss();
    getFragmentManager().popBackStack();
}