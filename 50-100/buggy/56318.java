private java.util.Map<java.lang.String, de.spricom.dessert.dependency.ClassFileEntry> findMatchingClasses(de.spricom.dessert.dependency.Rule rule) {
    java.util.Map<java.lang.String, de.spricom.dessert.dependency.ClassFileEntry> members = new java.util.HashMap<>();
    for (de.spricom.dessert.dependency.ClassFileEntry entry : scannedClasses.values()) {
        if ((members.containsKey(entry.getClassName())) && (rule.isMember(entry))) {
            members.put(entry.getClassName(), entry);
        }
    }
    return members;
}