private void startSignIn() {
    mUsername = prefs.getString("username", "");
    android.util.Log.d("prefs", "musername");
    if (mUsername.equals("")) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.github.nkzawa.socketio.androidchat.LoginActivity.class);
        startActivityForResult(intent, com.github.nkzawa.socketio.androidchat.MainFragment.REQUEST_LOGIN);
    }
}