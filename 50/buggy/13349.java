private boolean isImageLoaded(java.lang.String resourceName) {
    if (com.jstakun.gms.android.data.IconCache.images.containsKey(resourceName)) {
        return !(com.jstakun.gms.android.data.IconCache.images.get(resourceName).isRecycled());
    }else {
        return false;
    }
}