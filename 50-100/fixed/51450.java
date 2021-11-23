private void decodePresentationLayer(java.nio.ByteBuffer pduBuffer) throws org.openmuc.josistack.DecodingException {
    user_data = new org.openmuc.josistack.internal.presentation.asn1.UserData();
    try {
        user_data.decode(new org.openmuc.josistack.ByteBufferInputStream(pduBuffer), null);
    } catch (java.io.IOException e) {
        user_data = null;
        throw new org.openmuc.josistack.DecodingException("error decoding PPDU header", e);
    }
}