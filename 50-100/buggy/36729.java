protected void reloadSwipeStateInView(android.view.View frontView, int position) {
    if (!(opened.get(position))) {
        frontView.setTranslationX();
        com.nineoldandroids.view.ViewHelper.setTranslationX(frontView, 0.0F);
    }else {
        if (openedRight.get(position)) {
            com.nineoldandroids.view.ViewHelper.setTranslationX(frontView, swipeListView.getWidth());
        }else {
            com.nineoldandroids.view.ViewHelper.setTranslationX(frontView, (-(swipeListView.getWidth())));
        }
    }
}