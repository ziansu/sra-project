@java.lang.Override
public void cleanUpDpnForVpn(long dpnId, long vpnId, java.lang.String rd) {
    fibManager.populateFibOnNewDpn(dpnId, vpnId, rd);
}