void unterminated(java.lang.String key, java.lang.String value, int line) {
    sb.append("Unterminated value on line ").append(line).append(": ").append(key).append(" = ").append(value.trim());
}