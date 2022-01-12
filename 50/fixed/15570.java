public org.apache.lucene.util.BytesRef getBytesValue() {
    if ((size()) > 0) {
        return values[0];
    }else {
        return null;
    }
}