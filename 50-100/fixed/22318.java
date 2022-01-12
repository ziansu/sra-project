@java.lang.Override
public void run(org.zstack.network.service.eip.FlowTrigger trigger, java.util.Map data) {
    org.zstack.network.service.eip.EipBackend bkd = getEipBackend(providerType.toString());
    bkd.applyEip(struct, new org.zstack.header.core.Completion(trigger) {
        @java.lang.Override
        public void success() {
            trigger.next();
        }

        @java.lang.Override
        public void fail(org.zstack.header.errorcode.ErrorCode errorCode) {
            trigger.fail(errorCode);
        }
    });
}