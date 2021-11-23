public static byte[] serialize_compressed(java.lang.Object o) throws java.io.IOException {
    com.esotericsoftware.kryo.Kryo k = org.corfudb.client.view.Serializer.kryos.get();
    try (java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream()) {
        try (java.util.zip.DeflaterOutputStream dos = new java.util.zip.DeflaterOutputStream(baos)) {
            try (com.esotericsoftware.kryo.io.UnsafeOutput output = new com.esotericsoftware.kryo.io.UnsafeOutput(dos, 16384)) {
                k.writeClassAndObject(output, o);
                output.flush();
            }
            dos.finish();
        }
        return baos.toByteArray();
    }
}