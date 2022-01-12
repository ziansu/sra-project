@java.lang.Override
public void onResponse(retrofit2.Call<in.tosc.doandroidlib.objects.Regions> call, retrofit2.Response<in.tosc.doandroidlib.objects.Regions> response) {
    regions = response.body();
    dataCenterAdapter = new in.tosc.digitaloceanapp.adapters.DataCenterAdapter(regions, getContext(), ((in.tosc.digitaloceanapp.Interfaces.onItemSelectNewDroplet) (getActivity())));
    recyclerView.setAdapter(dataCenterAdapter);
    dataCenterAdapter.notifyDataSetChanged();
    android.util.Log.i(in.tosc.digitaloceanapp.fragments.DataCenterFragment.TAG, "onResponse: Regions loaded successfully!");
}