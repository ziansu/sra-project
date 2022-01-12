@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<in.tosc.doandroidlib.objects.Image>> call, retrofit2.Response<java.util.List<in.tosc.doandroidlib.objects.Image>> response) {
    imageList = response.body();
    imageAdapter = new in.tosc.digitaloceanapp.adapters.ImageAdapter(imageList, getContext(), ((in.tosc.digitaloceanapp.Interfaces.onItemSelectNewDroplet) (getActivity())));
    imageRecyclerView.setAdapter(imageAdapter);
    android.util.Log.e("Droplets fetched", java.lang.String.valueOf(imageList.size()));
}