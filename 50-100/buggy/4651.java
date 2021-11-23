@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.extinctspecie.betman.models.VIPLiveItem>> call, retrofit2.Response<java.util.List<com.extinctspecie.betman.models.VIPLiveItem>> response) {
    vipLiveItems = response.body();
    if ((vipLiveItems.size()) > 0) {
        lvAdapterTVVIPLive = new com.extinctspecie.betman.adapters.LVAdapterTVVIPLive(getActivity().getBaseContext(), vipLiveItems);
        listView.setAdapter(lvAdapterTVVIPLive);
    }
    tvTodayProgress.setVisibility(View.GONE);
}