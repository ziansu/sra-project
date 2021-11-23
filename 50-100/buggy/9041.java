public static java.lang.Boolean attachAssetToAccount(java.lang.String accountUuid, java.lang.String assetUuid) {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    params.put(KeyConstants.Uuid, accountUuid);
    params.put(KeyConstants.AttachedAssetUuid, assetUuid);
    java.lang.System.out.println("--------------------------------------------------");
    java.lang.System.out.println(accountUuid);
    java.lang.System.out.println(assetUuid);
    java.lang.System.out.println("--------------------------------------------------");
    return instances.sample_rating.WeightedRate.repository.accountAttach(params);
}