@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    if ((mAlbumType) != (com.loopeer.android.librarys.imagegroupview.activity.AlbumActivity.TAKE_PHOTO))
        getSupportLoaderManager().initLoader(com.loopeer.android.librarys.imagegroupview.activity.AlbumActivity.LOADER_ID_FOLDER, null, this);
    
}