public void updateGoalUI() {
    goalValue = java.lang.Integer.valueOf(sharedPref.getString(getString(R.string.pref_goal_key), "0"));
    if ((goalValue) == 0) {
        goalTextView.setText("No Goal Set");
        goalValueTextView.setVisibility(View.INVISIBLE);
        goalRemainTextView.setVisibility(View.INVISIBLE);
        goalRemainValueTextView.setVisibility(View.INVISIBLE);
    }else {
        goalTextView.setText("Goal :");
        goalValueTextView.setText(java.lang.Integer.toString(goalValue));
        goalValueTextView.setVisibility(View.VISIBLE);
        updateRemainingGoalValue();
    }
}