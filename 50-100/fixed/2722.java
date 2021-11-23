static java.lang.String gravityToString(@com.jecelyin.editor.v2.widget.AnyDrawerLayout.EdgeGravity
int gravity) {
    if ((gravity & (android.view.Gravity.LEFT)) == (android.view.Gravity.LEFT)) {
        return "LEFT";
    }
    if ((gravity & (android.view.Gravity.RIGHT)) == (android.view.Gravity.RIGHT)) {
        return "RIGHT";
    }
    return java.lang.Integer.toHexString(gravity);
}