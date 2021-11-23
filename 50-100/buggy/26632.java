@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String location = ((lon) + ",") + (lat);
    android.util.Log.d("location===", location);
    if ((checkJumpStatus.getBike_status()) == 0) {
        startActivity(com.school.bicycle.ui.ZxingActivity.class, "location", location, "status", "0");
    }else {
        startActivity(com.school.bicycle.ui.ZxingActivity.class, "location", location, "status", "1");
    }
}