public org.barebonesdigest.DigestChallengeResponse nonce(java.lang.String unquotedNonce) {
    if (unquotedNonce == null) {
        return quotedNonce(null);
    }
    return quotedNonce(org.barebonesdigest.Rfc2616AbnfParser.quote(unquotedNonce));
}