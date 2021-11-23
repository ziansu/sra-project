@java.lang.Override
public void onGlobalLayout() {
    int heightDiff = RlParent.getRootView().getHeight();
    int height = RlParent.getHeight();
    int diff = heightDiff - height;
    android.util.Log.i(com.xptschool.parent.ui.chat.TAG, ((((("onGlobalLayout  rootH " + heightDiff) + "  height:") + height) + " diff:") + diff));
    if (diff > 400) {
        isInputWindowShow = true;
    }else {
        isInputWindowShow = false;
    }
}