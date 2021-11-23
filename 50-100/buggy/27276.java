private void calcSubnets() {
    thiz.mSubnetsRange = new net.dckg.subnetter.SubnetRange[thiz.mSubnets];
    for (int i = 0; i < (thiz.mSubnets); i++) {
        thiz.mSubnetsRange[i] = new net.dckg.subnetter.SubnetRange(net.dckg.subnetter.IPUtils.intToAddr(((thiz.mAddrInt) + ((thiz.mHosts) * i))), net.dckg.subnetter.IPUtils.intToAddr(((thiz.mAddrInt) + (((thiz.mHosts) - 1) * (i + 1)))));
    }
}