@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(mContext, org.saarang.instieventsapp.Activities.EventsDetailsActivity.class);
    intent.putExtra(Event.COLUMN_EVENTID, id);
    android.util.Log.d(org.saarang.instieventsapp.Adapters.EventsAdapter.LOG_TAG, ((((("pos :: " + position) + " name :: ") + (mItems.get(position).getName())) + " id :: ") + (id)));
    mContext.startActivity(intent);
}