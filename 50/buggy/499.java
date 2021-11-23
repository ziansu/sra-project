public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.support.v4.content.CursorLoader(mContext, SongContract.SongData.CONTENT_URI, co.songliao.guitvi.ListFragment.projection, null, null, null);
}