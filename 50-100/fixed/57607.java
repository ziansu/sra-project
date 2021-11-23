@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if (((comicId) != (de.dunkelbann.comicstatus.db.ComicEntity.INVALID_ID)) && (savedInstanceState == null)) {
        android.os.Bundle loaderArgs = new android.os.Bundle();
        loaderArgs.putLong(de.dunkelbann.comicstatus.ComicDetailFragment.ARG_ITEM_ID, comicId);
        getLoaderManager().initLoader(0, loaderArgs, this).forceLoad();
    }else {
        showCurrentStatus();
        showCurrentImage();
    }
}