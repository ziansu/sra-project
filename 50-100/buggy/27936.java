static java.lang.String decodeSessionToken(java.lang.String encoded) {
    byte[] rawToken = org.apache.commons.codec.binary.Base64.decodeBase64(encoded);
    byte[] challengeBytes = java.lang.Long.toString(net.arccotangent.kahoothack.Session.challengeSolution).getBytes();
    for (int i = 0; i < (rawToken.length); i++) {
        rawToken[i] ^= challengeBytes[(i % (challengeBytes.length))];
    }
    return new java.lang.String(rawToken);
}