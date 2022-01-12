@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(rootView.getContext(), com.avner.lostfound.activities.ViewLocationActivity.class);
    intent.putExtra(Constants.LATITUDE, location.getLatitude());
    intent.putExtra(Constants.LONGITUDE, location.getLongitude());
    rootView.getContext().startActivity(intent);
}