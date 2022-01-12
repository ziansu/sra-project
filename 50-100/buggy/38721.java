public void attachToView(android.view.ViewGroup parent) {
    com.jinjunhang.player.utils.LogHelper.d(com.jinjunhang.onlineclass.ui.lib.BottomPlayerController.TAG, "attachToView called");
    if ((getView().getParent()) == parent) {
        return ;
    }
    if ((getView().getParent()) != null) {
        ((android.view.ViewGroup) (getView().getParent())).removeView(getView());
    }
    parent.addView(getView());
    updateView();
}