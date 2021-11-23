public static void deserializeSupportCodeChangeCollection(java.io.ObjectInput in, java.util.Collection collection) throws java.io.IOException, java.lang.ClassNotFoundException {
    int collectionSize = in.readInt();
    for (int i = 0; i < collectionSize; i++) {
        org.jini.rio.boot.SupportCodeChangeAnnotationContainer codeChangeAnnotationContainer = ((org.jini.rio.boot.SupportCodeChangeAnnotationContainer) (in.readObject()));
        java.lang.Object object = com.gigaspaces.internal.io.IOUtils.readObject(in, codeChangeAnnotationContainer);
        collection.add(object);
    }
}