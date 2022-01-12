@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (CREATE_EVENT_CODE)) {
        if (resultCode == (SUCCESS_CODE)) {
            ridgewell.pickupsports2.common.Event event = data.getExtras().getParcelable("created_event");
            events.add(event);
            sportingEventArrayAdapter.notifyDataSetChanged();
        }else {
        }
    }
}