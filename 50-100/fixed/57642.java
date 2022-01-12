private void initMenuButtonAnimations(android.content.res.TypedArray attr) {
    int showResId = attr.getResourceId(R.styleable.FloatingActionMenu_menu_fab_show_animation, R.anim.fab_scale_up);
    setMenuButtonShowAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), showResId));
    int hideResId = attr.getResourceId(R.styleable.FloatingActionMenu_menu_fab_hide_animation, R.anim.fab_scale_down);
    setMenuButtonHideAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), hideResId));
}