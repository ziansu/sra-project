private void addTile(java.lang.String spec, android.graphics.drawable.Drawable drawable, java.lang.CharSequence label, java.lang.CharSequence appLabel, android.content.Context context) {
    com.android.systemui.qs.QSTile.State state = new com.android.systemui.qs.QSTile.State();
    state.label = label;
    state.contentDescription = label;
    state.icon = new com.android.systemui.qs.QSTile.DrawableIcon(drawable);
    state.autoMirrorDrawable = false;
    addTile(spec, appLabel, state, false);
}