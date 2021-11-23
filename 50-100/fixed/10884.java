@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Spinner fishList = ((android.widget.Spinner) (findViewById(R.id.fishCaughtSpinner)));
    int index = fishList.getSelectedItemPosition();
    android.content.Intent intent = new android.content.Intent(v.getContext(), com.app.fish.catchreport.LiveAddFishActivity.class);
    intent.putExtra("TripInfo", trip);
    intent.putExtra("Fish", index);
    startActivity(intent);
}