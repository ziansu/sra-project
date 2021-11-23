@java.lang.Override
public void onError(java.lang.String errorMsg) {
    android.widget.Toast.makeText(ctx, errorMsg, Toast.LENGTH_SHORT).show();
    nr = new com.example.ishaandhamija.zinder.Utils.NearbyRestaurants(ctx, area, latitude, longitude, rvList, activity, getResponse);
}