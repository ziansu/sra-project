public void ignoreResources(org.rhq.core.domain.auth.Subject subject, int[] resourceIds) {
    if ((resourceIds == null) || ((resourceIds.length) == 0)) {
        return ;
    }
    checkStatus(subject, resourceIds, InventoryStatus.IGNORED, java.util.EnumSet.of(InventoryStatus.NEW, InventoryStatus.COMMITTED));
    return ;
}