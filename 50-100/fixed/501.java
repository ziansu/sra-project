@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if ((stringWallet) == null) {
        callback.onTaskexecuted("", "Could not get wallet");
    }else
        if (!(android.text.TextUtils.isEmpty(stringWallet.optString("error")))) {
            callback.onTaskexecuted("", stringWallet.toString());
        }else {
            callback.onTaskexecuted(stringWallet.toString(), "");
        }
    
}