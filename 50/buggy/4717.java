public void setShowImeWithHardKeyboard(boolean show) {
    Settings.Secure.putIntForUser(mResolver, Settings.Secure.SHOW_IME_WITH_HARD_KEYBOARD, (show ? 1 : 0), mCurrentUserId);
}