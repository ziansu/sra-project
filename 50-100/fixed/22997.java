private boolean serializeStringInto(java.io.ByteArrayOutputStream serialized, @android.support.annotation.Nullable
java.lang.String s) {
    if (s != null) {
        try {
            serialized.write(android.util.Base64.encode(s.getBytes(), Base64.NO_WRAP));
        } catch (java.io.IOException e) {
            return false;
        }
    }
    serialized.write(',');
    return true;
}