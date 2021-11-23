@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i(com.gribanskij.miser.categories.CategoryFragment.LOG_TAG, ((java.lang.Integer.toString(loader.getId())) + " RESET"));
    switch (loader.getId()) {
        case com.gribanskij.miser.categories.CategoryFragment.CATEGORY_NAME_LOADER :
            {
                nameCursor = null;
                break;
            }
        case com.gribanskij.miser.categories.CategoryFragment.CATEGORY_SUM_LOADER :
            {
                sumCursor = null;
                break;
            }
        default :
            {
                break;
            }
    }
}