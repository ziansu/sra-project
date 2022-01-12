public java.lang.String getCollectionClassname() {
    java.lang.String descriptorClass = descriptor.replace("/", ".");
    if (descriptorClass.startsWith("L")) {
        descriptorClass = descriptorClass.substring(1, ((descriptorClass.length()) - 1));
    }
    return descriptorClass;
}