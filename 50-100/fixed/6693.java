private void createElanForwardingTablesList(java.lang.String elanName, org.opendaylight.yang.gen.v1.urn.opendaylight.netvirt.elan.rev150602.forwarding.entries.MacEntry macEntry, org.opendaylight.controller.md.sal.binding.api.WriteTransaction tx) {
    org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.netvirt.elan.rev150602.forwarding.entries.MacEntry> macEntryId = org.opendaylight.netvirt.elan.utils.ElanUtils.getMacEntryOperationalDataPath(elanName, macEntry.getMacAddress());
    com.google.common.base.Optional<org.opendaylight.yang.gen.v1.urn.opendaylight.netvirt.elan.rev150602.forwarding.entries.MacEntry> existingMacEntry = elanUtils.read(broker, LogicalDatastoreType.OPERATIONAL, macEntryId);
    if ((!(existingMacEntry.isPresent())) && ((elanUtils.getElanMacTable(elanName)) != null)) {
        tx.put(LogicalDatastoreType.OPERATIONAL, macEntryId, macEntry, true);
    }
}