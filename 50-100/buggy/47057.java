@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<anonymousme.gitstar.Models.Project>> call, java.lang.Throwable t) {
    if (swipeContainer.isRefreshing())
        swipeContainer.setRefreshing(false);
    else
        mProgress.dismiss();
    
    android.widget.Toast.makeText(getApplicationContext(), "Unable to load the repositories.", Toast.LENGTH_SHORT).show();
}