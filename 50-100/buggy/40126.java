@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    stringBuilder.append("Segments: ");
    stringBuilder.append(node.getIdentifier());
    stringBuilder.append(" ");
    stringBuilder.append("Location: ");
    stringBuilder.append(this.getLocation().getX());
    stringBuilder.append(",");
    stringBuilder.append(this.getLocation().getY());
    return stringBuilder.toString();
}