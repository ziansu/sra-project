@java.lang.Override
public void onResponse(retrofit.Response<java.util.List<com.example.proxymeister.antonsskafferi.model.Menu>> response, retrofit.Retrofit retrofit) {
    java.util.List<com.example.proxymeister.antonsskafferi.model.Menu> menus = response.body();
    if (menus != null) {
        com.example.proxymeister.antonsskafferi.model.Menu menu = com.example.proxymeister.antonsskafferi.model.Menu.mergedMenuAtCurrentTime(menus);
        setTitle(((menu.type) == 0 ? "Lunchmeny" : "Middagsmeny"));
        adapter = new com.example.proxymeister.antonsskafferi.MenuAdapter(menu, editMenu, this);
        rv.setAdapter(adapter);
    }
}