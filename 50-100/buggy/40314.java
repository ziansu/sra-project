@java.lang.Override
public void onAnimationComplete() {
    if (doLayout && (!(isLayoutComplete))) {
        doLayout();
        isLayoutComplete = true;
        fragmentPanel.remove(navElement.getIndex());
        fragmentPanel.setAnimationDuration(org.kaaproject.avro.ui.gwt.client.widget.RecordFieldWidget.FRAGMENT_SWITCH_ANIMATION_DURATION);
        fragmentPanel.add(navElement.getWidget());
        fragmentPanel.showWidget(navElement.getIndex());
    }else {
        navElement.onShown();
        fragmentPanel.setAnimationCallback(null);
        isAnimating = false;
    }
}