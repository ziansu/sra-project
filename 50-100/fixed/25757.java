boolean isDrawerView(android.view.View child) {
    final int gravity = ((com.jecelyin.editor.v2.widget.AnyDrawerLayout.LayoutParams) (child.getLayoutParams())).gravity;
    final int absGravity = android.support.v4.view.GravityCompat.getAbsoluteGravity(gravity, android.support.v4.view.ViewCompat.getLayoutDirection(child));
    if ((absGravity & (android.view.Gravity.LEFT)) != 0) {
        return true;
    }
    if ((absGravity & (android.view.Gravity.RIGHT)) != 0) {
        return true;
    }
    return false;
}