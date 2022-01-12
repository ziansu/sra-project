private void hideAllViewExceptKeyBoard() {
    com.cpoopc.smoothemotionkeyboard.utils.DebugLog.e("----");
    for (int i = 0; i < (showViewList.size()); i++) {
        hideView(showViewList.get(i));
    }
}