@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(rootView.getContext(), com.avner.lostfound.activities.ViewLocationActivity.class);
    if (null == item) {
        android.util.Log.d("DEBUG", ("Failed to retrieve item from adapter list, at position " + position));
        return ;
    }
    intent.putExtra(Constants.LATITUDE, location.getLatitude());
    intent.putExtra(Constants.LONGITUDE, location.getLongitude());
    rootView.getContext().startActivity(intent);
}