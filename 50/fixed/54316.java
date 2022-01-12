@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    tryLogin(mEmail, mPassword);
    return true;
}