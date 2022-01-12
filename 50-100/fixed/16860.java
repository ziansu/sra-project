private java.lang.String getSignUpErrorMessage(int code) {
    java.lang.String errorMessage = mContext.getString(R.string.signup_error_unknown);
    switch (code) {
        case com.parse.ParseException.EMAIL_TAKEN :
            errorMessage = mContext.getString(R.string.signup_error_email_taken);
            break;
        case com.parse.ParseException.INVALID_EMAIL_ADDRESS :
            errorMessage = mContext.getString(R.string.signup_error_email_invalid);
            break;
        case com.parse.ParseException.USERNAME_TAKEN :
            errorMessage = mContext.getString(R.string.signup_error_username_taken);
            break;
    }
    return errorMessage;
}