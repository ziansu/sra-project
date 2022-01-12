private int findDarkAnimationOriginIndex(@android.annotation.Nullable
android.graphics.PointF screenLocation) {
    if ((screenLocation == null) || ((screenLocation.y) < (mTopPadding))) {
        return com.android.systemui.statusbar.stack.NotificationStackScrollLayout.AnimationEvent.DARK_ANIMATION_ORIGIN_INDEX_ABOVE;
    }
    if ((screenLocation.y) > (getBottomMostNotificationBottom())) {
        return com.android.systemui.statusbar.stack.NotificationStackScrollLayout.AnimationEvent.DARK_ANIMATION_ORIGIN_INDEX_BELOW;
    }
    android.view.View child = getClosestChildAtRawPosition(screenLocation.x, screenLocation.y);
    if (child != null) {
        return getNotGoneIndex(child);
    }else {
        return com.android.systemui.statusbar.stack.NotificationStackScrollLayout.AnimationEvent.DARK_ANIMATION_ORIGIN_INDEX_ABOVE;
    }
}