@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    dialog.dismiss();
    if (!(activity.requestCameraPermissions()))
        activity.takePictureWithIntent();
    
}