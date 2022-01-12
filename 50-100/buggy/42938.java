public static java.lang.String registerAccount(java.lang.String publicKey, java.lang.String accountName, java.lang.String[] assetUuids) {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    params.put(KeyConstants.PublicKey, publicKey);
    params.put(KeyConstants.AccountName, accountName);
    java.lang.String uuid = instances.sample_rating.WeightedRate.repository.accountAdd(params, assetUuids);
    return uuid;
}