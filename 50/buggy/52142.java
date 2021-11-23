public org.barebonesdigest.DigestChallengeResponse nonce(java.lang.String unquotedNonce) {
    return quotedNonce(org.barebonesdigest.Rfc2616AbnfParser.quote(unquotedNonce));
}