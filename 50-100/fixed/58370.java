private void getIGAccessToken() {
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, "getIGAccessToken() called");
    final java.lang.String authorizationURL = com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.instagramService.getAuthorizationUrl(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.EMPTY_TOKEN);
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, authorizationURL);
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... params) {
            getFragmentManager().beginTransaction().replace(R.id.fl_activity_blocparty, com.ngynstvn.android.blocparty.ui.fragment.IGAuthFragment.newInstance(authorizationURL)).commit();
            return null;
        }
    }.execute();
}