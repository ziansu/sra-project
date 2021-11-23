public void activityStart(final com.remswork.classmanager.model.clazz.Clazz clazz, final int typeRequest) {
    android.content.Intent intent = new android.content.Intent(this, com.remswork.classmanager.ClazzActivity.class);
    intent.putExtra("subject", clazz.getSubject());
    intent.putExtra("section", clazz.getSection());
    intent.putParcelableArrayListExtra("scheduleList", ((java.util.ArrayList<? extends android.os.Parcelable>) (clazz.getListOfSchedule())));
    intent.putExtra("typeRequest", typeRequest);
    startActivity(intent);
}