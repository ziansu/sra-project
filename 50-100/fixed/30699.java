@java.lang.Override
public void onGlobalLayout() {
    int heightDiff = RlParent.getRootView().getHeight();
    int height = RlParent.getHeight();
    int diff = heightDiff - height;
    if (diff > 400) {
        isInputWindowShow = true;
    }else {
        isInputWindowShow = false;
    }
}