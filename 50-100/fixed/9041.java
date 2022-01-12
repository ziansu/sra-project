public static java.lang.Boolean attachAssetToAccount(java.lang.String assetUuid, java.lang.String accountUuid) {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    params.put(KeyConstants.Uuid, accountUuid);
    params.put(KeyConstants.AttachedAssetUuid, assetUuid);
    return instances.sample_rating.WeightedRate.repository.accountAttach(params);
}