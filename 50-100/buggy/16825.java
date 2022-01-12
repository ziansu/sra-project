public boolean isValid() {
    int bootIndicatorValue = getBootIndicatorValue();
    return ((!(isEmpty())) && (bootIndicatorValue == 0)) || ((bootIndicatorValue == (org.jnode.partitions.ibm.IBMPartitionTableEntry.BOOTABLE)) && ((getNrSectors()) > 0));
}