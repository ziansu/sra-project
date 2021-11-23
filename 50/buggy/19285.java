@com.mindorks.placeholderview.annotations.Resolve
private void onResolve() {
    nameAgeTxt.setText(("Name " + ((com.mindorks.test.swipe.TinderCard.count)++)));
}