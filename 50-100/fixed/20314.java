public void add(java.lang.String className, java.lang.String href, java.lang.String text) {
    if (excludeBetweenParentheses) {
        if (!(text.trim().startsWith("("))) {
            sb.append(row(className, href, text));
        }
    }
}