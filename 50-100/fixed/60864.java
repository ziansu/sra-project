@java.lang.Override
public void call(java.lang.Throwable throwable) {
    android.util.Log.d(com.example.djs.restaurantstracker.fragments.RateFragment.TAG, ("sendRateRequest error: " + (throwable.getMessage())));
    if (throwable instanceof retrofit.RetrofitError) {
        retrofit.RetrofitError error = ((retrofit.RetrofitError) (throwable));
        android.util.Log.d(com.example.djs.restaurantstracker.fragments.RateFragment.TAG, ("sendRateRequest error: " + (error.getUrl())));
    }
    android.widget.Toast.makeText(getContext(), "An error has occured, your rating has not been saved.", Toast.LENGTH_SHORT).show();
}