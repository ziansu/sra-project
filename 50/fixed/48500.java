@java.lang.Override
protected void onPostExecute(org.jinstagram.auth.model.Token accessToken) {
    com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.instagram = new org.jinstagram.Instagram(accessToken);
}