private boolean isEmpty(boolean trim) {
    return ((mText) == null) || (trim ? mText.trim().isEmpty() : mText.isEmpty());
}