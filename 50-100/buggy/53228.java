private void userAuthentication() {
    kat.android.com.movielist.rest.RestClient.get().getAuthentication(mToken, mLogin, mPassword, new retrofit.Callback<kat.android.com.movielist.rest.pojo.userdatails.Token>() {
        @java.lang.Override
        public void success(kat.android.com.movielist.rest.pojo.userdatails.Token token, retrofit.client.Response response) {
            mToken = token.getRequest_token();
            getSession();
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            android.widget.Toast.makeText(getApplicationContext(), "please enter correct credentials", Toast.LENGTH_SHORT).show();
        }
    });
}