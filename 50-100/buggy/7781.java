@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.tv_activity_album_info_artist_name :
            android.content.Intent intent = new android.content.Intent(this, com.zolotuhinartem.lastfminfo.activities.searched_artists.SearchedArtistsActivity.class);
            intent.putExtra(SearchedArtistsActivity.ARTIST_NAME, this.album.getArtist());
            startActivity(intent);
    }
}