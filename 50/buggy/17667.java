protected java.lang.String getString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.StringBuilder stringBuilder : stringBuilders) {
        sb.append(sb).append('\n');
    }
    return sb.toString();
}