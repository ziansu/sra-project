@java.lang.Override
public void setPressedIcon(com.android.launcher3.BubbleTextView icon, android.graphics.Bitmap background) {
    if ((icon == null) || (background == null)) {
        mTouchFeedbackView.setBitmap(null);
        mTouchFeedbackView.animate().cancel();
    }else {
        if (mTouchFeedbackView.setBitmap(background)) {
            mTouchFeedbackView.alignWithIconView(icon, mShortcutsAndWidgets, null);
            mTouchFeedbackView.animateShadow();
        }
    }
}