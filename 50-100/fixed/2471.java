public java.lang.String displayName() {
    if (((description) != null) && ((description.trim()) != "")) {
        return ((((clientName) + " - ") + (Name)) + " - ") + (description);
    }
    return ((clientName) + " - ") + (Name);
}