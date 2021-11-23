@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.paulvarry.intra42.api.model.EventsUsers>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
    linearLayoutProgress.setVisibility(View.INVISIBLE);
    progressBarButton.setVisibility(View.GONE);
    buttonSubscribe.setEnabled(true);
}