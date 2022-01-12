private com.albroco.barebonesdigest.DigestChallenge.QualityOfProtection selectQop() {
    if ((supportedQopTypes.contains(QualityOfProtection.AUTH_INT)) && ((this.entityBodyDigest) != null)) {
        return com.albroco.barebonesdigest.DigestChallenge.QualityOfProtection.AUTH_INT;
    }
    if (supportedQopTypes.contains(QualityOfProtection.AUTH)) {
        return com.albroco.barebonesdigest.DigestChallenge.QualityOfProtection.AUTH;
    }
    if (supportedQopTypes.contains(QualityOfProtection.UNSPECIFIED_RFC2069_COMPATIBLE)) {
        return com.albroco.barebonesdigest.DigestChallenge.QualityOfProtection.UNSPECIFIED_RFC2069_COMPATIBLE;
    }
    return com.albroco.barebonesdigest.DigestChallenge.QualityOfProtection.UNSPECIFIED_RFC2069_COMPATIBLE;
}