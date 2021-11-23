@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.style = " ";
    android.util.Log.e("EditClassFragment.style", ("" + (app.com.digitallearning.TeacherModule.Classes.EditClassFragment.style)));
    TopicFragment.topic = " ";
    DescriptionFragment.description = " ";
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.topic1 = " ";
}