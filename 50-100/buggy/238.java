@java.lang.Override
public void onItemSelected(android.net.Uri contentUri) {
    if (mTwoPane) {
        android.os.Bundle args = new android.os.Bundle();
        args.putParcelable(DetailFragment.DETAIL_URI, contentUri);
        com.example.android.sunshine2.DetailFragment fragment = new com.example.android.sunshine2.DetailFragment();
        fragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().replace(R.id.weather_detail_container, fragment, com.example.android.sunshine2.MainActivity.DETAILFRAGMENT_TAG);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.example.android.sunshine2.DetailActivity.class).setData(contentUri);
        startActivity(intent);
    }
}