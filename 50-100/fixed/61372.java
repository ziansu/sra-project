private void saveAlarm() {
    if ((mStudents.size()) > 0) {
        mAllGeoEventItem.put(mStudents.get(mCurrnetStudentIdx).getStudent_id(), mEventReport);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String input = gson.toJson(mAllGeoEventItem);
        android.content.SharedPreferences sp = getActivity().getSharedPreferences(Def.SHARE_PREFERENCE, Context.MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sp.edit();
        editor.putString(Def.SP_GEO_ITEM_MAP, input);
        editor.commit();
    }
}