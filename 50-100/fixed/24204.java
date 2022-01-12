@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "Add player to scout list.", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(getActivity(), tom.chinesefootballtracker.ScoutActivity.class);
    android.support.v4.app.ActivityOptionsCompat activityOptions = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity());
    android.support.v4.app.ActivityCompat.startActivity(getActivity(), intent, activityOptions.toBundle());
}