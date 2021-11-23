private boolean hasSeparator(final java.lang.CharSequence s, final int start, final int count) {
    for (int i = start; i < (start + count); i++) {
        char c = s.charAt(i);
        if (!(android.telephony.PhoneNumberUtils.isNonSeparator(c))) {
            return true;
        }
    }
    return false;
}