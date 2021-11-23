@java.lang.Override
public void onItemClick(int position, android.view.View view) {
    if ((tempString) != null) {
        tempString.delete(0, tempString.length());
    }
    touchedPosition = position;
    android.widget.TextView memoTitle = ((android.widget.TextView) (view.findViewById(R.id.memo_title)));
    tempString.append(memoTitle.getText().toString());
    expandCollapseLayout(view);
    java.lang.String touchedRecording = memoTitle.getText().toString();
    theTouchedRecording = touchedRecording;
}