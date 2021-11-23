@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserArtist(MyApplication.userName, artist.getArtistId());
    dbHelper.deleteUserArtist(dbHelper.getWritableDatabase(), artist.getArtistId());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    mArtists.remove(position);
    notifyDataSetChanged();
}