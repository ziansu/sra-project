public long addVoucher(java.lang.String clientID, long expireTime, long voucherSize) {
    org.xtreemfs.mrc.quota.ClientVoucherManager clientVoucherManager = openVoucherMap.get(clientID);
    if (clientVoucherManager == null) {
        clientVoucherManager = new org.xtreemfs.mrc.quota.ClientVoucherManager(clientID, fileID);
        openVoucherMap.put(clientID, clientVoucherManager);
    }
    blockedSpace += voucherSize;
    clientVoucherManager.addVoucher(expireTime);
    return (fileSize) + (blockedSpace);
}