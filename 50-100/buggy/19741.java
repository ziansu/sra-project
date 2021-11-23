@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
    com.example.xyzreader.ui.ArticleDetailFragment fragment = ((com.example.xyzreader.ui.ArticleDetailFragment) (object));
    if (fragment != null) {
        mSelectedItemUpButtonFloor = fragment.getUpButtonFloor();
        updateUpButtonPosition();
    }
}