@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(mContext, com.androidteam.jobnow.acitvity.DetailJobsActivity.class);
    mContext.startActivity(intent);
}