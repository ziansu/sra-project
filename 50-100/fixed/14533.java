private void updatePattern() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    int i = 0;
    for (java.lang.String p : patterns) {
        stringBuilder.append('(');
        stringBuilder.append(p);
        if (i == ((patterns.size()) - 1)) {
            stringBuilder.append(")");
        }else {
            stringBuilder.append(")|");
        }
        i++;
    }
    pattern = java.util.regex.Pattern.compile(stringBuilder.toString());
}