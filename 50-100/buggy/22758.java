public void startAsyncTaskGetAPI() {
    url = android.net.Uri.parse(getString(R.string.host_name)).buildUpon().appendPath("api").appendPath("species").build().toString();
    android.widget.Toast.makeText(getContext(), url, Toast.LENGTH_SHORT).show();
    new com.example.duyenbui.qldv.fragment.LibrarySpeciesFragment.AsyncTaskLoadListSpecies().execute(url);
}