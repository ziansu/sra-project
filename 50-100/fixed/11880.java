public boolean onAreaTouched(org.andengine.input.touch.TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
    if (pSceneTouchEvent.isActionDown()) {
        setTouchAreaBindingOnActionDownEnabled(false);
        setTouchAreaBindingOnActionMoveEnabled(false);
        android.content.Intent shareIntent = new android.content.Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.setPackage("com.twitter.android");
        shareIntent.putExtra(Intent.EXTRA_TEXT, (("My score in #ProtectTheTown is " + (score)) + " points. And yours?"));
        activity.tweetScore(shareIntent);
    }
    return true;
}