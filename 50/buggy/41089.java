@java.lang.Override
public void onFailure(retrofit2.Call<java.util.ArrayList<com.theironyard.finalproject.representations.Reward>> call, java.lang.Throwable t) {
    android.support.design.widget.Snackbar.make(view, "There was an issue with the API.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
}