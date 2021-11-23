@java.lang.Override
public android.database.Cursor loadInBackground() {
    android.database.Cursor result = super.loadInBackground();
    if ((!(mEnableCapture)) || (!(com.zhihu.matisse.internal.utils.MediaStoreCompat.hasCameraFeature(getContext())))) {
        return result;
    }
    android.database.MatrixCursor dummy = new android.database.MatrixCursor(com.zhihu.matisse.internal.loader.AlbumMediaLoader.PROJECTION);
    dummy.addRow(new java.lang.Object[]{ com.zhihu.matisse.internal.entity.Item.ITEM_ID_CAPTURE , com.zhihu.matisse.internal.entity.Item.ITEM_DISPLAY_NAME_CAPTURE , "" , 0 });
    return new android.database.MergeCursor(new android.database.Cursor[]{ dummy , result });
}