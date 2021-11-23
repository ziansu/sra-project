static byte[] marshall(java.util.List<com.kumbaya.router.Marshaller.TLV> data) throws java.io.IOException {
    java.io.ByteArrayOutputStream stream = new java.io.ByteArrayOutputStream();
    for (com.kumbaya.router.Marshaller.TLV entry : data) {
        byte[] typeTLV = com.kumbaya.router.TypeLengthValues.encode(entry.type);
        byte[] lengthTLV = com.kumbaya.router.TypeLengthValues.encode(entry.content.length);
        stream.write(typeTLV);
        stream.write(lengthTLV);
        stream.write(entry.content);
    }
    return stream.toByteArray();
}