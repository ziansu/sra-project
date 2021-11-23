@java.lang.Override
void onUpdated(org.opendaylight.vtn.manager.internal.vnode.VTenantChange ectx, org.slf4j.Logger logger, org.opendaylight.vtn.manager.internal.util.ChangedData<?> data) {
    org.opendaylight.vtn.manager.internal.util.ChangedData<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfig> cdata = cast(data);
    org.opendaylight.vtn.manager.internal.util.vnode.VBridgeIdentifier ident = getVBridgeIdentifier(cdata);
    org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfig vbrc = cdata.getValue();
    if (logger.isInfoEnabled()) {
        org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfig old = cdata.getOldValue();
        logger.info("{}: vBridge has been changed: old={{}}, new={{}}", ident, toString(vbrc), toString(old));
    }
    ectx.updateBridge(ident, vbrc);
}