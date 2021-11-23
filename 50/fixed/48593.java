public void createObjForIdentifier(org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?> instanceIdentifier) {
    txDataMap.get(instanceIdentifier).add(new org.opendaylight.distributed.tx.impl.DTXTestTransaction.myDataObj());
}