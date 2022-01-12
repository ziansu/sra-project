@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.buttonEditRefereeDetails)) {
        android.content.Intent editRefereeProfileIntent = new android.content.Intent(activityRefereeProfile, com.example.nickozoulis.teamproj.activities.ActivityEditRefereeProfile.class);
        editRefereeProfileIntent.putExtra(MainActivity.REFEREEINFO, referee.toString());
        startActivityForResult(editRefereeProfileIntent, MainActivity.REQUEST_CODE);
    }
    return super.onOptionsItemSelected(item);
}