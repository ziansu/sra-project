public void saveMood(android.view.View v) {
    Trigger = TriggerHolder.getText().toString();
    Details = DetailHolder.getText().toString();
    moodController.updateMood(position, username, SocialSit, date, state, Trigger, Details);
    finish();
}