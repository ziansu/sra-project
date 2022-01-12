private void writeNewQuery(java.lang.String queryId, java.lang.String question, int timeStamp, int numberOfAnswers) {
    mDatabaseReference = com.google.firebase.database.FirebaseDatabase.getInstance().getReference();
    mQuestionsReference = mDatabaseReference.child(com.namclu.android.bloquery.api.QueryDataSource.QUESTIONS);
    java.lang.String key = mDatabaseReference.push().getKey();
    com.namclu.android.bloquery.api.model.Query query = new com.namclu.android.bloquery.api.model.Query(key, question, timeStamp, numberOfAnswers);
    mQuestionsReference.push().setValue(query);
}