public void attemptCreateMeeting() {
    showError(false, "");
    if (validateInput()) {
        mCMProgressBar.setVisibility(View.VISIBLE);
        com.cse5306.wemeet.tasks.CreateMeetingTask createMeetingTask = new com.cse5306.wemeet.tasks.CreateMeetingTask(com.cse5306.wemeet.activities.CreateMeetingActivity.datePicked, com.cse5306.wemeet.activities.CreateMeetingActivity.timePicked, mlocationString, userPreferences.getSessionUserPrefUsername(), java.lang.Integer.parseInt(mCMMaxPpl.getText().toString()));
        createMeetingTask.response = this;
        createMeetingTask.execute();
    }
}