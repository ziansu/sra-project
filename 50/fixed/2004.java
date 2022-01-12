public int getTxDataSize(org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?> instanceIdentifier) {
    return this.txDataMap.get(instanceIdentifier).size();
}