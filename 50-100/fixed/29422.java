private kafka.serializer.Decoder<?> getDecoder(java.lang.Class decoder) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    if (decoder == null) {
        return new kafka.serializer.DefaultDecoder(new kafka.utils.VerifiableProperties());
    }
    return ((kafka.serializer.Decoder) (decoder.newInstance()));
}