public void save() {
    observable.onNext(interview);
    android.content.SharedPreferences.Editor prefsEditor = storage.edit();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(interview);
    prefsEditor.putString(de.udk.drl.mazirecorderandroid.models.InterviewStorage.INTERVIEW_STORAGE_ITEM, json);
    prefsEditor.commit();
    interview.isNew = false;
}