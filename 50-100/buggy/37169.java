@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("SHOW/HIDE PASS BUTTON CLICKED");
    if (isPasswordShowing) {
        mShowHidePasswordButton.setText(R.string.sign_up_show);
        mPasswordEditText.setInputType(((android.text.InputType.TYPE_CLASS_TEXT) | (android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD)));
        ((com.s7design.menu.views.MenuEditText) (mPasswordEditText)).setFont(false);
    }else {
        mShowHidePasswordButton.setText(R.string.sign_up_hide);
        mPasswordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        ((com.s7design.menu.views.MenuEditText) (mPasswordEditText)).setFont(false);
    }
    isPasswordShowing = !(isPasswordShowing);
}