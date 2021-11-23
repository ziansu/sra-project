public org.openlmis.distribution.dto.DistributionDTO getDistribution(org.openlmis.distribution.domain.Distribution arg, java.lang.Long userId) {
    org.openlmis.distribution.domain.Distribution distribution = getFullSyncedDistribution(arg);
    if (distribution != null) {
        if (userId != null) {
            insertEditInProgress(userId, distribution.getId());
        }
        java.util.Map<java.lang.Long, org.openlmis.distribution.domain.FacilityDistribution> facilityDistributionMap = facilityDistributionService.getData(distribution, true);
        distribution.setFacilityDistributions(facilityDistributionMap);
        return distribution.transform();
    }
    return null;
}