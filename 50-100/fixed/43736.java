@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(de.dunkelbann.comicstatus.ComicDetailFragment.ARG_ITEM_ID)) {
        comicId = getArguments().getLong(de.dunkelbann.comicstatus.ComicDetailFragment.ARG_ITEM_ID);
    }
    setRetainInstance(true);
    newComic = (comicId) == (de.dunkelbann.comicstatus.db.ComicEntity.INVALID_ID);
}