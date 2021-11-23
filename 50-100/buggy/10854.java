public static com.xeiam.xchange.coinbaseex.service.CoinbaseExDigest createInstance(java.lang.String secretKey) {
    byte[] decodedSecretKey = null;
    try {
        decodedSecretKey = si.mazi.rescu.utils.Base64.decode(secretKey);
    } catch (java.io.IOException e) {
        throw new com.xeiam.xchange.exceptions.ExchangeException("Cannot decode secret key");
    }
    return secretKey == null ? null : new com.xeiam.xchange.coinbaseex.service.CoinbaseExDigest(decodedSecretKey);
}