protected void updateTierPolicyProperties(java.lang.String autoTierPolicyId, com.emc.storageos.db.client.model.Volume volume) {
    if (null != autoTierPolicyId) {
        java.util.List<java.net.URI> autoTierPolicyURIs = _dbClient.queryByConstraint(AlternateIdConstraint.Factory.getAutoTieringPolicyByNativeGuidConstraint(autoTierPolicyId));
        if (!(autoTierPolicyURIs.isEmpty())) {
            volume.setAutoTieringPolicyUri(autoTierPolicyURIs.get(0));
        }
    }
}