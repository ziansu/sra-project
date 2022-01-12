public java.lang.String SafeSubString(java.lang.String s, int MaxLength) {
    if (!(android.text.TextUtils.isEmpty(s))) {
        if ((s.length()) >= MaxLength) {
            return s.substring(0, MaxLength);
        }
    }
    return s;
}