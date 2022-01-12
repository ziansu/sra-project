public void onPostExecute(java.lang.String result) {
    if ((result != null) && (!(result.equals("")))) {
        java.lang.String campusChar = com.ihwapp.android.model.Curriculum.getCampusChar(campus);
        android.content.SharedPreferences prefs = com.ihwapp.android.model.Curriculum.ctx.getSharedPreferences(((year) + campusChar), Context.MODE_PRIVATE);
        prefs.edit().putString("scheduleJSON", result).commit();
        parseScheduleJSON();
    }
}