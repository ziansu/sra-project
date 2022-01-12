@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.arrow_lb :
            startActivityForResult(Games.Leaderboards.getLeaderboardIntent(getGoogleApiClient(), Const.ARROW_LB), org.gdg.frisbee.android.arrow.ArrowActivity.REQUEST_LEADERBOARD);
            return true;
        case R.id.arrow_tagged :
            android.content.Intent i = new android.content.Intent(this, org.gdg.frisbee.android.arrow.ArrowTaggedActivity.class);
            android.os.Bundle data = new android.os.Bundle();
            data.putInt(org.gdg.frisbee.android.arrow.EXTRA_SELECTED_DRAWER_ITEM_ID, Const.DRAWER_ARROW);
            i.putExtras(data);
            startActivity(i);
            return true;
    }
    return super.onOptionsItemSelected(item);
}