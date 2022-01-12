@java.lang.Override
public void onEnd() {
    layout.applyTo(child);
    child.setAnimation(null);
    if (animatedViewList.contains(child)) {
        animatedViewList.remove(child);
    }
    if (animatedViewList.isEmpty()) {
        mAddedViewContainer = null;
        addView(view, position);
        addAnimation(view, alpha, new com.github.sjnyag.AnimationWrapLayout.AnimationCallback() {
            @java.lang.Override
            public void onEnd() {
            }
        });
    }
}