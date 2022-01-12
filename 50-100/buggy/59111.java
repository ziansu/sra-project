@java.lang.Override
public void onResponse(retrofit.Response<com.example.proxymeister.antonsskafferi.model.Menu> response, retrofit.Retrofit retrofit) {
    com.example.proxymeister.antonsskafferi.model.Menu menu = response.body();
    if (menu != null) {
        setTitle(("Redigera " + ((menu.type) == 0 ? "lunchmeny" : "middagsmeny")));
        adapter = new com.example.proxymeister.antonsskafferi.MenuAdapter(menu, editMenu, this);
        rv.setAdapter(adapter);
    }
}