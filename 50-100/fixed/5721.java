private static boolean isValidCategory(java.lang.String category) {
    android.util.Log.v("Media Helper", ("categories: " + category));
    return (category == null) || ((!(category.contains(com.kabouzeid.gramophone.auto.MediaIDHelper.CATEGORY_SEPARATOR))) && (!(category.contains(com.kabouzeid.gramophone.auto.MediaIDHelper.LEAF_SEPARATOR))));
}