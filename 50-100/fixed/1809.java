private void msgNormalize(java.lang.StringBuilder builder, java.lang.String line) {
    for (int i = 0; i < ((line.length()) - 1); i += 2) {
        if ((line.charAt(i)) == '-') {
            i++;
        }
        builder.append(line.charAt(i));
        builder.append(line.charAt((i + 1)));
        builder.append(" ");
    }
}