@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    switch (status) {
        case userRecoverableError :
            activity.startActivityForResult(userException.getIntent(), BaseActivity.REQUEST_PERMISSION);
            break;
        case requestFailed :
            reactToError();
            break;
        case okay :
            break;
        default :
            throw new java.lang.UnsupportedOperationException("Not implemented this case");
    }
}