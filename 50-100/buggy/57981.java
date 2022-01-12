public static void setBadgeCount(android.content.Context context, android.graphics.drawable.LayerDrawable icon, int count) {
    com.playxiangqi.hoxchess.BadgeDrawable badge;
    android.graphics.drawable.Drawable reuse = icon.findDrawableByLayerId(R.id.ic_badge);
    if ((reuse != null) && (reuse instanceof com.playxiangqi.hoxchess.BadgeDrawable)) {
        badge = ((com.playxiangqi.hoxchess.BadgeDrawable) (reuse));
    }else {
        badge = new com.playxiangqi.hoxchess.BadgeDrawable(context);
    }
    badge.setCount(count);
    icon.mutate();
    icon.setDrawableByLayerId(R.id.ic_badge, badge);
}