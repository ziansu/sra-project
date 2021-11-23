public void addRequestToList(com.codepath.contact.models.Request request) {
    if ((requestsAdapter) != null)
        requestsAdapter.add(request);
    else
        android.util.Log.d(com.codepath.contact.fragments.ListFragment.TAG, "guess what, requestsAdapter is null...");
    
}