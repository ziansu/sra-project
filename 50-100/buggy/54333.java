@java.lang.Override
public void onClick(android.view.View v) {
    int newPosition = java.lang.Math.max(((currentPosition) - 1), 0);
    if (newPosition == (currentPosition)) {
        return ;
    }
    getStatTextView(currentPosition).setEnabled(false);
    getStatTextView(newPosition).setEnabled(true);
    currentPosition = newPosition;
}