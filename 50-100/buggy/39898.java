@java.lang.Override
protected void onPostExecute(java.lang.String webPageDigest) {
    ((android.widget.TextView) (mActivity.findViewById(R.id.outputTextView))).setText(webPageDigest);
    if ((mStoredHash) != "-1") {
        byte[] hashBytes = webPageDigest.getBytes(com.google.common.base.Charsets.UTF_8);
        byte firstByteOfHash = hashBytes[0];
        if ((firstByteOfHash % 2) == 0) {
            android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
            sharedPreferences.edit().putString(mUri.toString(), webPageDigest);
        }else {
        }
    }
}