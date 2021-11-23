private void loadByKeyword() {
    com.itbooks.data.rest.RSBookQuery query = new com.itbooks.data.rest.RSBookQuery(mKeyword);
    try {
        com.itbooks.net.api.Api.queryBooks(query, new retrofit.Callback<com.itbooks.data.rest.RSBookList>() {
            @java.lang.Override
            public void success(com.itbooks.data.rest.RSBookList rsBookList, retrofit.client.Response response) {
                showBookList(rsBookList);
            }

            @java.lang.Override
            public void failure(retrofit.RetrofitError error) {
                com.chopping.utils.Utils.showLongToast(getApplicationContext(), "failure");
            }
        });
    } catch (com.itbooks.net.api.ApiNotInitializedException e) {
        e.printStackTrace();
    }
}