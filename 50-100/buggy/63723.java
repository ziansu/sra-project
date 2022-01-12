public io.resource.DataRef echoPackage(io.resource.DataPackage dataPackage) {
    for (int i = 0; i < (referenceList.size()); i++) {
        final io.resource.DataRef reference = referenceList.get(i);
        final io.resource.DataPackage current = reference.getPackage();
        if (current != null) {
            if (current == dataPackage) {
                return reference;
            }
        }
    }
    return null;
}