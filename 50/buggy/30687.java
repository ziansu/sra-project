@java.lang.Override
public void onClick(android.view.View v) {
    if ((isKeyboardShown) && (tapBarMenu.isOpened())) {
        hideKeyboard(dialogView);
        return ;
    }
    tapBarMenu.toggle();
}