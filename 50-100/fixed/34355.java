private void updateRemainingGoalValue() {
    goalRemainValue = (((goalValue) - (counterValue)) >= 1) ? (goalValue) - (counterValue) : 0;
    if ((goalRemainValue) > 0) {
        goalRemainValueTextView.setText(java.lang.Long.toString(goalRemainValue));
        goalRemainTextView.setText("Remain :");
        goalRemainTextView.setVisibility(View.VISIBLE);
        goalRemainValueTextView.setVisibility(View.VISIBLE);
    }else {
        goalRemainValueTextView.setVisibility(View.INVISIBLE);
        goalRemainTextView.setVisibility(View.VISIBLE);
        goalRemainTextView.setText("MashaAllah ! Goal Achieved.");
    }
}