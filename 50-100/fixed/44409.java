private void getSession(java.lang.String token) {
    kat.android.com.movielist.rest.RestClient.get().getSession(token, new retrofit.Callback<kat.android.com.movielist.rest.pojo.userdatails.Session>() {
        @java.lang.Override
        public void success(kat.android.com.movielist.rest.pojo.userdatails.Session session, retrofit.client.Response response) {
            mSession_ID = session.getSession_id();
            getAccount();
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            android.widget.Toast.makeText(getApplicationContext(), "Session FAIL", Toast.LENGTH_SHORT).show();
        }
    });
}