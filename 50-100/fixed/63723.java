public io.resource.DataRef echoPackage(io.resource.DataPackage dataPackage) {
    for (io.resource.DataRef reference : referenceList) {
        final io.resource.DataPackage current = reference.getPackage();
        if (current != null) {
            if (current == dataPackage) {
                return reference;
            }
        }
    }
    return null;
}