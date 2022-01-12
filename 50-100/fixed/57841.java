@java.lang.Override
public void onResponse(retrofit2.Call<com.github.geekarist.whereishome.CommuteListAdapter.DistanceMatrix> call, retrofit2.Response<com.github.geekarist.whereishome.CommuteListAdapter.DistanceMatrix> response) {
    int duration = ((int) (response.body().rows.get(0).elements.get(0).duration.value));
    mCommuteList.add(new com.github.geekarist.whereishome.Commute(placeLabel(toPlace), duration));
}