public void writeDouble(double pDouble) {
    coremem.offheap.OffHeapMemoryAccess.setDouble(mPosition, pDouble);
    mPosition += 8;
}