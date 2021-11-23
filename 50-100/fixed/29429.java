private static java.lang.String filterNonAscii(java.lang.String input) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (input.length()); i++) {
        int c = input.charAt(i);
        if (c > 127) {
            sb.append(" ");
        }else {
            sb.append(input.charAt(i));
        }
    }
    return sb.toString();
}