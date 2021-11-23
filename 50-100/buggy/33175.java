@java.lang.Override
public void onClick(android.view.View v) {
    long nextFlashId = (java.lang.Integer.parseInt(finalFlashId1)) - 1;
    android.content.Intent intent = new android.content.Intent(mContext, org.buildmlearn.learnwithflashcards.activities.MainActivity.class).setType("text/plain").putExtra(Intent.EXTRA_TEXT, java.lang.String.valueOf(nextFlashId)).setFlags((((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP)));
    startActivity(intent);
    finish();
}