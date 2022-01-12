@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    edu.cornell.engineering.ewh.hippoandroid.CallSession call = sessions[position];
    android.content.Intent intent = new android.content.Intent(this, edu.cornell.engineering.ewh.hippoandroid.VideoCallActivity.class);
    intent.putExtra(edu.cornell.engineering.ewh.hippoandroid.MainActivity.SESSION_NAME, call.getName());
    startActivity(intent);
}