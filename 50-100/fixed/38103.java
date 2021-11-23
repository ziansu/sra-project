@com.facebook.react.uimanager.annotations.ReactProp(name = "viewRef")
public void setViewRef(com.cmcewen.blurview.BlurringView view, int viewRef) {
    if (((com.cmcewen.blurview.BlurViewManager.context) != null) && ((com.cmcewen.blurview.BlurViewManager.context.getCurrentActivity()) != null)) {
        android.view.View viewToBlur = com.cmcewen.blurview.BlurViewManager.context.getCurrentActivity().findViewById(viewRef);
        if (viewToBlur != null) {
            view.setBlurredView(viewToBlur);
        }
    }
}