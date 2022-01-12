@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    int myVoteValue = myVote.getValue();
    int maxVoteValue = maxVote.getValue();
    infoView.setText((((myVoteValue + " von ") + maxVoteValue) + " Votierungen"));
    infoView.setTextColor((myVoteValue <= maxVoteValue ? android.graphics.Color.argb(255, 153, 204, 0) : android.graphics.Color.argb(255, 204, 0, 0)));
}