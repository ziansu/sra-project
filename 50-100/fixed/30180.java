@java.lang.Override
public boolean isValid(java.lang.String value) {
    int i;
    try {
        i = java.lang.Integer.parseInt(value);
    } catch (java.lang.NumberFormatException e) {
        setMessage(R.string.tika_error_number_required);
        return false;
    }
    if (i < (minimum)) {
        setMessage(msgId);
        return false;
    }
    return true;
}