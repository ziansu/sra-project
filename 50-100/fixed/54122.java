@java.lang.Override
public void resetImage() {
    java.lang.String path;
    if ((!(mItemInList.getItem().isNew())) && ((mItemInList.getItem().getDefaultImagePath()) != null)) {
        path = mItemInList.getItem().getDefaultImagePath();
    }else {
        path = ru.android.ainege.shoppinglist.util.file.Image.getPathFromResource(getActivity(), R.drawable.no_image);
    }
    loadImage(path);
}