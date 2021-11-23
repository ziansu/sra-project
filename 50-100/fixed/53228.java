private void userAuthentication(java.lang.String token) {
    kat.android.com.movielist.rest.RestClient.get().getAuthentication(token, mLogin, mPassword, new retrofit.Callback<kat.android.com.movielist.rest.pojo.userdatails.Token>() {
        @java.lang.Override
        public void success(kat.android.com.movielist.rest.pojo.userdatails.Token token, retrofit.client.Response response) {
            getSession(token.getRequest_token());
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            android.widget.Toast.makeText(getApplicationContext(), "please enter correct credentials", Toast.LENGTH_SHORT).show();
        }
    });
}