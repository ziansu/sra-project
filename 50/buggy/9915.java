@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "添加", Toast.LENGTH_SHORT).show();
    ((org.bridge.activity.MainActivity) (context)).startPubNoteIntent();
}