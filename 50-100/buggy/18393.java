private void fillKitsStr(java.lang.String kitName, java.lang.String kitsStr) {
    java.lang.String[] productIdToQuantityPairs = kitsStr.split(",");
    for (java.lang.String productIdToQuantityPairStr : productIdToQuantityPairs) {
        java.lang.String[] productIdToQuantityPair = productIdToQuantityPairStr.split(":");
        kits.put(kitsStr, org.springframework.data.util.Pair.of(java.lang.Long.valueOf(productIdToQuantityPair[0]), java.lang.Integer.valueOf(productIdToQuantityPair[1])));
    }
}