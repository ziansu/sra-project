private static boolean isValidCategory(java.lang.String category) {
    android.util.Log.v("Media Helper", ("categories: " + category));
    return (category == null) || (((category.indexOf(com.kabouzeid.gramophone.auto.MediaIDHelper.CATEGORY_SEPARATOR)) < 0) && ((category.indexOf(com.kabouzeid.gramophone.auto.MediaIDHelper.LEAF_SEPARATOR)) < 0));
}