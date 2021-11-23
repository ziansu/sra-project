public java.lang.String getClientNonce() {
    if ((clientNonce) == null) {
        synchronized(this) {
            if ((clientNonce) == null) {
                clientNonce = org.barebonesdigest.DigestChallengeResponse.generateRandomNonce();
            }
        }
    }
    return clientNonce;
}