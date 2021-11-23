public void selectWeeklyGoal(android.view.View view) {
    if ((userData.getGoal()) == (userData.LOSE_WEIGHT)) {
        selectGainGoal(view);
    }else
        if ((userData.getGoal()) == (userData.GAIN_WEIGHT)) {
            selectLossGoal(view);
        }else {
            com.example.android.buddybuilding.Helper.makeToast("Error selecting weekly goal", this);
        }
    
}