@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
    if ((((getCurrentFragment()) != object) && (object != null)) && (object instanceof me.ccrama.redditslide.Fragments.CommentPage)) {
        mCurrentFragment = ((me.ccrama.redditslide.Fragments.CommentPage) (object));
        if (!(mCurrentFragment.loaded)) {
            if (mCurrentFragment.isAdded()) {
                mCurrentFragment.doAdapter();
            }
        }
    }
}