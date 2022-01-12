@java.lang.Override
final java.lang.String predicateToString() {
    final java.lang.StringBuilder sb = new java.lang.StringBuilder("{pattern=[").append(pattern.pattern());
    sb.append("],ignoreCase=[").append(ignoreCase);
    sb.append("],fullMatch=[").append(fullMatch).append("]}");
    return sb.toString();
}