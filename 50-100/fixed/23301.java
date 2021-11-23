@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    android.util.Log.i("Comp", "Now Completed");
    dialog.dismiss();
    android.widget.Toast.makeText(getContext(), "Course Added successfully", Toast.LENGTH_SHORT).show();
    if (com.cs442.team4.tahelper.utils.ObjectUtils.isNotEmpty(ta_memebers)) {
        sendNotificationToCourseTA(ce, ta_memebers);
    }
}