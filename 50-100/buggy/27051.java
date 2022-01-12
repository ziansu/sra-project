protected void onConfigureSelf() {
    int padding = com.yarolegovich.mp.util.Utils.dpToPixels(com.yarolegovich.mp.AbsMaterialPreference.getContext(), 16);
    com.yarolegovich.mp.AbsMaterialPreference.setPadding(padding, padding, padding, padding);
    setGravity(Gravity.CENTER_VERTICAL);
    com.yarolegovich.mp.AbsMaterialPreference.setClickable(true);
    setBackgroundResource(com.yarolegovich.mp.util.Utils.clickableBackground(com.yarolegovich.mp.AbsMaterialPreference.getContext()));
}