private static boolean isParcelableArray(java.lang.Object value) {
    if (!(value instanceof java.util.ArrayList<?>)) {
        return false;
    }
    java.util.List<?> list = ((java.util.ArrayList<?>) (value));
    for (java.lang.Object object : list) {
        if (!(object instanceof android.os.Parcelable)) {
            return false;
        }
    }
    return true;
}