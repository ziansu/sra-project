void invalidTextAfterIdentifier(com.moandjiezana.toml.Identifier identifier, char text, int line) {
    sb.append("Invalid text after key ").append(identifier.getName()).append(" on line ").append(line).append(". Make sure to terminate the value or add a comment (#).");
}