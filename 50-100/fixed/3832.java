private java.util.Optional<org.mef.nrp.impl.ActivationTransaction> prepareTransaction(org.opendaylight.yang.gen.v1.uri.onf.coremodel.corenetworkmodule.objectclasses.rev160413.GForwardingConstruct fwdC) {
    final java.util.List<org.opendaylight.yang.gen.v1.uri.onf.coremodel.corenetworkmodule.objectclasses.rev160413.g_forwardingconstruct.FcPort> list = fwdC.getFcPort();
    final org.opendaylight.yang.gen.v1.uri.onf.coremodel.corenetworkmodule.objectclasses.rev160413.GFcPort a = list.get(0);
    final org.opendaylight.yang.gen.v1.uri.onf.coremodel.corenetworkmodule.objectclasses.rev160413.GFcPort z = list.get(1);
    return org.mef.nrp.impl.ForwardingConstructHelper.isTheSameNode(fwdC) ? getTxForNode(a, z, fwdC) : getTxForMultiNode(a, z, fwdC);
}