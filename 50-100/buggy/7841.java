@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserArtist(MyApplication.userName, artist.getArtistId());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    if (x.equals("Artist Deleted!")) {
        dbHelper.deleteUserArtist(dbHelper.getWritableDatabase(), artist.getArtistId());
        mArtists.remove(position);
        notifyDataSetChanged();
    }
}