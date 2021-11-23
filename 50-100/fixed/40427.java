private static int camelCase(final java.lang.String name, final java.lang.StringBuilder builder, final int index) {
    int position = index;
    final char c = name.charAt(position);
    if ((!(java.lang.Character.isLetter(c))) && (index < ((name.length()) - 1))) {
        builder.append(java.lang.Character.toUpperCase(name.charAt((++position))));
    }else {
        builder.append(c);
    }
    return position;
}