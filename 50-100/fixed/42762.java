@java.lang.Override
public java.lang.String generate(java.lang.String symbols, int length) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(length);
    for (int i = 0; i < length; i++) {
        builder.append(symbols.charAt(random.nextInt(symbols.length())));
    }
    return builder.toString();
}