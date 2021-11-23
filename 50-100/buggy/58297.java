@org.androidannotations.annotations.Click
public void viewItemReportButtonClicked() {
    final org.give2peer.karma.Application app = this.app;
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    builder.setMessage(getString(R.string.view_item_report_confirm)).setPositiveButton(R.string.dialog_item_report_positive, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            reportItem();
        }
    }).setNegativeButton(R.string.dialog_item_report_negative, null);
    builder.create().show();
}