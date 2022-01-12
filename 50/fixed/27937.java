public static boolean isBrowseable(@android.support.annotation.NonNull
java.lang.String mediaID) {
    return !(mediaID.contains(com.kabouzeid.gramophone.auto.MediaIDHelper.LEAF_SEPARATOR));
}