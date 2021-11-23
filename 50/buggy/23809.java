@java.lang.Override
public void onColumnCountUpdate(int colCount) {
    android.widget.TextView currentCount = ((android.widget.TextView) (findViewById(R.id.colCount)));
    currentCount.setText(java.lang.String.valueOf(colCount));
    setUpGameMakerLayout();
}