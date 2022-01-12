private static org.webrtc.MediaConstraints defaultPcConstraints() {
    org.webrtc.MediaConstraints pcConstraints = new org.webrtc.MediaConstraints();
    pcConstraints.optional.add(new org.webrtc.MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
    pcConstraints.mandatory.add(new org.webrtc.MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
    pcConstraints.mandatory.add(new org.webrtc.MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
    return pcConstraints;
}