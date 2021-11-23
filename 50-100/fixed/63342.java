@java.lang.Override
public void onItemClick(final android.widget.AdapterView<?> parent, final android.view.View view, final int position, final long id) {
    mItem = mAdapter.getItem(position);
    com.andrew.apollo.utils.NavUtils.openAlbumProfile(getActivity(), mItem.mAlbumName, mItem.mArtistName, mItem.mAlbumId, com.andrew.apollo.utils.MusicUtils.getSongListForAlbum(getActivity(), mItem.mAlbumId));
}