public void setShowImeWithHardKeyboard(boolean show) {
    Settings.Secure.putIntForUser(mResolver, Settings.Secure.SHOW_IME_WITH_HARD_KEYBOARD, 1, mCurrentUserId);
}