private boolean hasSeparator(final java.lang.CharSequence s, final int start, final int count) {
    for (int i = start; i < (start + count); i++) {
        if ((i < ((start + count) - 1)) && (CheckSeparator(s, i))) {
            continue;
        }
        char c = s.charAt(i);
        if (!(android.telephony.PhoneNumberUtils.isNonSeparator(c))) {
            return true;
        }
    }
    return false;
}