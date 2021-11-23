private void addCharItem(java.util.ArrayList<java.lang.String> list, java.lang.CharSequence chars, java.lang.String plainText) {
    java.lang.String tmp;
    if (!(android.text.TextUtils.isEmpty(chars))) {
        tmp = chars.toString();
        if (!(list.contains(tmp))) {
            plainText += (chars.toString()) + '\n';
            list.add(tmp);
        }
    }
}