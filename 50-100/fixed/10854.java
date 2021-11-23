public static com.xeiam.xchange.coinbaseex.service.CoinbaseExDigest createInstance(java.lang.String secretKey) {
    if (secretKey == null) {
        return null;
    }
    try {
        return new com.xeiam.xchange.coinbaseex.service.CoinbaseExDigest(si.mazi.rescu.utils.Base64.decode(secretKey));
    } catch (java.io.IOException e) {
        throw new com.xeiam.xchange.exceptions.ExchangeException("Cannot decode secret key");
    }
}