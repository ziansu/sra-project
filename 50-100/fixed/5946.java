private static java.lang.String generateTestValue() {
    java.lang.String firstline = "23 B\n";
    java.lang.String[] field = new java.lang.String[]{ "K...." , "b...." , ".k..." , "....." , "....." , "....." };
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(firstline);
    for (int i = (field.length) - 1; i >= 0; i--) {
        builder.append(((field[i]) + "\n"));
    }
    return builder.toString();
}