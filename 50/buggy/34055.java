@java.lang.Override
public void onClick(android.view.View v) {
    layout_MainMenu.getForeground().setAlpha(20);
    layout_MainMenu.getForeground().setColorFilter(R.color.gray, PorterDuff.Mode.OVERLAY);
    initiateCommentPopup();
}