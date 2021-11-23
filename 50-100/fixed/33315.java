private void onAppStatusRemoved(java.lang.String apkUrl) {
    int positionOfOldApp = -1;
    for (int i = 0; i < (appsToShowStatus.size()); i++) {
        if (android.text.TextUtils.equals(appsToShowStatus.get(i).status.getUniqueKey(), apkUrl)) {
            positionOfOldApp = i;
            break;
        }
    }
    if (positionOfOldApp != (-1)) {
        appsToShowStatus.remove(positionOfOldApp);
        populateItems();
        notifyItemRemoved(positionOfOldApp);
    }
}