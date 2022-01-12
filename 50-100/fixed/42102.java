protected void reloadSwipeStateInView(android.view.View frontView, int position) {
    if (!(opened.get(position))) {
        frontView.setTranslationX(0.0F);
    }else {
        if (openedRight.get(position)) {
            frontView.setTranslationX(swipeListView.getWidth());
        }else {
            frontView.setTranslationX((-(swipeListView.getWidth())));
        }
    }
}