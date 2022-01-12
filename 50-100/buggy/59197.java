@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (CREATE_EVENT_CODE)) {
        java.lang.System.out.println("here");
        if (resultCode == (SUCCESS_CODE)) {
            java.lang.System.out.println("here");
            android.content.Intent intent = this.getIntent();
            ridgewell.pickupsports2.common.Event event = intent.getExtras().getParcelable("created_event");
            events.add(event);
            sportingEventArrayAdapter.notifyDataSetChanged();
        }else {
        }
    }
}