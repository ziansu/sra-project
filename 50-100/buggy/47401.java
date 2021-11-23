public void showNewTweetPopup() {
    android.view.View activityViewRoot = ((android.view.ViewGroup) (this.getView().findViewById(R.id.listView)));
    if (!(popupWindow.isShowing())) {
        android.view.View v = mListView.getChildAt(0);
        int top = (v == null) ? 0 : v.getTop();
        popupWindow.showAtLocation(activityViewRoot, Gravity.CENTER, 0, (-300));
    }
}