@java.lang.Override
protected void onAttachedToWindow() {
    int drawableId;
    if (AuthMethod.USER_ID.equals(_authMethod)) {
        _loginEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        drawableId = R.drawable.default_user_icon;
    }else
        if (AuthMethod.EMAIL.equals(_authMethod)) {
            _loginEditText.setInputType(InputType.TYPE_CLASS_TEXT);
            drawableId = R.drawable.default_mail_icon;
        }else {
            _loginEditText.setInputType(InputType.TYPE_CLASS_TEXT);
            drawableId = R.drawable.default_user_icon;
        }
    
    _loginEditText.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(drawableId), null, null, null);
}