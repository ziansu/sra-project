@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.view.View view = null;
    switch (position) {
        case 0 :
            view = mMediaShareFragment.getView();
            break;
        case 1 :
            view = mMediaFragment.getView();
            break;
        case 2 :
            view = mAlbumFragment.getView();
            break;
    }
    container.addView(view);
    return view;
}