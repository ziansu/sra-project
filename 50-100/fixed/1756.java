public void yesButtonClick(android.view.View view) {
    _person.livedWholeLife = true;
    _person.livedInYears = null;
    org.rhok.linguist.code.DatabaseHelper dbHelper = new org.rhok.linguist.code.DatabaseHelper(getApplicationContext());
    dbHelper.updatePersonLivedWholeLife(_person.personid, true);
    android.content.Intent intent = getIntent().getParcelableExtra(InterviewNameActivity.ARG_FINAL_INTENT);
    if (intent == null)
        intent = new android.content.Intent(this, org.rhok.linguist.activity.recording.RecordingInstructionsActivity.class);
    
    intent.putExtra(IntentUtil.ARG_PERSON_ID, _person.personid);
    startActivity(intent);
}