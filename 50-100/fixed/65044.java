void duplicateKey(java.lang.String key, int line) {
    sb.append("Duplicate key");
    if (line > (-1)) {
        sb.append(" on line ").append(line);
    }
    sb.append(": ").append(key);
}