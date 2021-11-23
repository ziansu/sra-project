private void submit() {
    new android.app.AlertDialog.Builder(getActivity()).setTitle("Submit score").setMessage("Are you sure you want to submit score?").setPositiveButton("Submit", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
            mToActivityMethod.onSubmit(mCurrentSessionEdit.getText().toString());
        }
    }).setNegativeButton("Don\'t submit", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).show();
}