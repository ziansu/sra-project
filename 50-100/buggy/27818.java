@java.lang.Override
public void onItemClick(int position, android.view.View view) {
    touchedPosition = position;
    android.widget.TextView memoTitle = ((android.widget.TextView) (view.findViewById(R.id.memo_title)));
    tempString = memoTitle.getText().toString();
    expandCollapseLayout(view);
    java.lang.String touchedRecording = memoTitle.getText().toString();
    theTouchedRecording = touchedRecording;
}