@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(mContext, io.geeteshk.hyper.activity.ProjectActivity.class);
    intent.putExtra("project", mObjects[newPos]);
    intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
    if ((Build.VERSION.SDK_INT) >= 21) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
    }
    ((android.support.v7.app.AppCompatActivity) (mContext)).startActivityForResult(intent, 0);
}