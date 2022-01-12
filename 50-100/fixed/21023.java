@java.lang.Override
public void onClick(android.view.View button) {
    button.setSelected((!(button.isSelected())));
    if (button.isSelected()) {
        mAccessToken.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
    }else {
        mAccessToken.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
    }
}