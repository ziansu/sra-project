public java.lang.String getType() {
    return (isConfidential()) && (type.equals("String")) ? "GuardedString" : type;
}