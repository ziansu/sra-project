@java.lang.Override
protected void onPostExecute(org.jinstagram.auth.model.Token accessToken) {
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, "igLogin's onPostExecute() called");
    com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.instagram = new org.jinstagram.Instagram(accessToken);
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, "WHAT ABOUT NOW??!!!");
    authoritative.onSuccess();
}