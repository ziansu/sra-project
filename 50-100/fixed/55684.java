@java.lang.Override
public void onParseSuccess(int requestCode, org.tndata.officehours.model.ResultSet result) {
    for (org.tndata.officehours.model.Course course : ((org.tndata.officehours.parser.ParserModels.CourseList) (result)).results) {
        android.util.Log.d(org.tndata.officehours.util.DataSynchronizer.TAG, course.toString());
        android.util.Log.d(org.tndata.officehours.util.DataSynchronizer.TAG, course.getInstructor().toString());
    }
    callback.onDataLoaded();
}