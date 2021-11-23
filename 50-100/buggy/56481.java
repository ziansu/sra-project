@java.lang.Override
protected final void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    android.preference.ListPreference lpCourse = ((android.preference.ListPreference) (findPreference("studiengang")));
    if ((entries.length) > 0) {
        lpCourse.setEntries(entries);
        lpCourse.setEntryValues(entryValues);
        lpCourse.setEnabled(true);
        updateSemesterData(lpCourse.getValue());
    }
    progressDialog.dismiss();
}