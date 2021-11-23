public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, karan.com.popularmovies1.MovieDetails.class);
    android.os.Bundle mBundle = new android.os.Bundle();
    mBundle.putParcelable(PARCEL_KEY, movieUtilses.get(position));
    intent.putExtras(mBundle);
    startActivity(intent);
}