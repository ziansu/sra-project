@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    boolean retCode = true;
    switch (item.getItemId()) {
        case R.id.ic_action_search_room :
            final android.content.Intent searchIntent = new android.content.Intent(this, im.vector.activity.VectorUnifiedSearchActivity.class);
            this.startActivity(searchIntent);
            break;
        case R.id.ic_action_mark_all_as_read :
            if (markAllMessagesAsReadWhenOffline()) {
                im.vector.activity.CommonActivityUtils.specificUpdateBadgeUnreadCount(mSession, getApplicationContext());
            }else {
                markAllMessagesAsRead();
            }
            break;
        default :
            retCode = super.onOptionsItemSelected(item);
            break;
    }
    return retCode;
}