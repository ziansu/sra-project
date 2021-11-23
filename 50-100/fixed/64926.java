@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    int status = intent.getIntExtra(com.example.sasha.myapplication.views.DetailGuideInfoActivity.FINISH, 0);
    android.util.Log.d(MainActivity.LOG_TAG, ("onReceive " + (com.example.sasha.myapplication.views.DetailGuideInfoActivity.STATUS_FINISH)));
    if (status == (com.example.sasha.myapplication.views.DetailGuideInfoActivity.STATUS_FINISH)) {
        android.util.Log.d(MainActivity.LOG_TAG, ("onReceive " + (com.example.sasha.myapplication.views.DetailGuideInfoActivity.STATUS_FINISH)));
        mFab.setImageResource(R.drawable.ic_delete_black_24dp);
        mFab.setVisibility(View.VISIBLE);
    }
}