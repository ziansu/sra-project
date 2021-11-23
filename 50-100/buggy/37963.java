@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    android.util.Log.e("REsulTofEditClass", ("" + result));
    dlg.dismiss();
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.style = " ";
    android.util.Log.e("EditClassFragment.style", ("" + (app.com.digitallearning.TeacherModule.Classes.EditClassFragment.style)));
    TopicFragment.topic = " ";
    DescriptionFragment.description = " ";
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.topic1 = " ";
    android.content.Intent intenttoClass = new android.content.Intent(this, app.com.digitallearning.TeacherModule.ClassActivity.class);
    startActivity(intenttoClass);
    finish();
}