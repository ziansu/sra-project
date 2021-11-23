@java.lang.Override
protected void onPreExecute() {
    pd.setIndeterminate(true);
    pd.setCanceledOnTouchOutside(false);
    pd.setMessage("Sending..");
    pd.show();
}