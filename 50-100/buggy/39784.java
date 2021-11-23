@java.lang.Override
public void onFailure(retrofit2.Call<com.greensquad.atforecast.models.Shelter> call, java.lang.Throwable t) {
    loadingBar.setVisibility(View.GONE);
    swipeContainer.setRefreshing(false);
    android.widget.Toast.makeText(getContext(), "Error loading content. Please try again.", Toast.LENGTH_SHORT).show();
    getFragmentManager().popBackStack();
    android.util.Log.e(com.greensquad.atforecast.fragments.ShelterDetailFragment.LOG_TAG, t.toString());
    if (animationEnabled) {
        slideInAnimation();
    }
}