@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.reservatiesysteem.lotte.reservatiesysteem.model.Message>> call, retrofit2.Response<java.util.List<com.reservatiesysteem.lotte.reservatiesysteem.model.Message>> response) {
    if ((response.body()) == null) {
        lvMessages.setEmptyView(txtEmpty);
        txtEmpty.setVisibility(View.VISIBLE);
    }else {
        final com.reservatiesysteem.lotte.reservatiesysteem.adapter.MessageAdapter messageAdapter = new com.reservatiesysteem.lotte.reservatiesysteem.adapter.MessageAdapter(getApplicationContext(), R.layout.view_message_entry, response.body());
        txtEmpty.setVisibility(View.GONE);
        lvMessages.setAdapter(messageAdapter);
    }
}