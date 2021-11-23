public void invalidStockSymbolAlert() {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
    builder.setMessage("The Stock Symbol entered is invalid.\n Please enter a valid Stock Symbol.").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).create().show();
}