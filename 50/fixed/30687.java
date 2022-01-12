@java.lang.Override
public void onClick(android.view.View v) {
    if (tapBarMenu.isOpened()) {
        hideKeyboard(dialogView);
    }
    tapBarMenu.toggle();
}