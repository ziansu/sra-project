public java.lang.String getCollectionClassname() {
    if ((descriptorClass) != null) {
        return descriptorClass;
    }
    java.lang.String descriptorClass = descriptor.replace("/", ".");
    if (descriptorClass.startsWith("L")) {
        descriptorClass = descriptorClass.substring(1, ((descriptorClass.length()) - 1));
    }
    this.descriptorClass = descriptorClass;
    return descriptorClass;
}