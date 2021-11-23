@java.lang.Override
public void onBackPressed() {
    if (container.onBackHandle())
        return ;
    
    if (keyboard.isCustomKeyboardVisible()) {
        keyboard.hideCustomKeyboard();
        return ;
    }
    presenter.onBackPressed();
}