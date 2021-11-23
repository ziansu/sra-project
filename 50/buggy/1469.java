@java.lang.Override
protected void onLoad() {
    super.onLoad();
    initBubble(gwt.material.design.client.base.helper.ColorHelper.setupComputedBackgroundColor(getBackgroundColor()), getPosition().getCssName());
}