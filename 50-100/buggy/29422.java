private kafka.serializer.Decoder<?> getDecoder(java.lang.String decoder) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    if (decoder == null) {
        return new kafka.serializer.DefaultDecoder(new kafka.utils.VerifiableProperties());
    }
    java.lang.Class decoderClass = java.lang.Class.forName(decoder);
    return ((kafka.serializer.Decoder) (decoderClass.newInstance()));
}