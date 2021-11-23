@java.lang.Override
public void onClick(android.view.View v) {
    if (com.fashare.activitytracker.AccessibilityUtil.checkAccessibility(this)) {
        com.fashare.activitytracker.Tile.instance.onClick();
        finish();
    }
}