public com.google.samples.apps.iosched.explore.TagFilterHolder createFromParcel(android.os.Parcel in) {
    com.google.samples.apps.iosched.explore.TagFilterHolder holder = new com.google.samples.apps.iosched.explore.TagFilterHolder();
    java.lang.String[] filters = in.createStringArray();
    java.util.Collections.addAll(holder.mSelectedFilters, filters);
    int[] categories = in.createIntArray();
    java.lang.System.arraycopy(categories, 0, holder.mCategories, 0, categories.length);
    holder.mShowLiveStreamedSessions = (in.readInt()) == 1;
    return holder;
}