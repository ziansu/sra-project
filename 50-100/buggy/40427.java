private static int camelCase(final java.lang.String fieldName, final java.lang.StringBuilder builder, final int index) {
    int position = index;
    final char c = fieldName.charAt(position);
    if (!(java.lang.Character.isLetter(c))) {
        if (index < (fieldName.length())) {
            builder.append(java.lang.Character.toUpperCase(fieldName.charAt((++position))));
        }
    }else {
        builder.append(c);
    }
    return position;
}