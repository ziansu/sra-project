public void showNewTweetPopup() {
    android.view.View view = this.getView();
    if (view != null) {
        android.view.View activityViewRoot = view.findViewById(R.id.listView);
        if (!(popupWindow.isShowing())) {
            android.view.View v = mListView.getChildAt(0);
            int top = (v == null) ? 0 : v.getTop();
            popupWindow.showAtLocation(activityViewRoot, Gravity.CENTER, 0, (-300));
        }
    }
}