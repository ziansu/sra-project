@java.lang.Override
protected java.util.List<com.vis.beans.VideoEntry> doInBackground(java.lang.Void... params) {
    java.util.Set<java.lang.String> selectedInterest = prefs.getStringSet(Constants.PREFERENCES_SELECTED_INTERESTS, null);
    if ((selectedInterest != null) && ((selectedInterest.size()) > 0)) {
        return getVideosListWithHashTags(selectedInterest);
    }else {
        return getVideosList();
    }
}