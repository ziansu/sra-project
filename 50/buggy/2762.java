public java.lang.String toString() {
    return name().toLowerCase().replaceFirst(name().substring(0, 1).toLowerCase(), name().substring(0, 1).toUpperCase());
}