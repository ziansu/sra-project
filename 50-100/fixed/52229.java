@java.lang.Override
public void onClick(android.view.View v) {
    int newPosition = java.lang.Math.min(((currentPosition) + 1), com.calvinlsliang.betrayalstattracker.view.StatPickerLayout.STATS_LENGTH);
    getStatTextView(currentPosition).setEnabled(false);
    getStatTextView(newPosition).setEnabled(true);
    currentPosition = newPosition;
}