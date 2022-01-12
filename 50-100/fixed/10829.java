@java.lang.Override
public void onSuccess(com.google.common.base.Optional<org.opendaylight.yang.gen.v1.urn.opendaylight.faas.fabric.rev150930.fabric.attributes.Options> result) {
    if (result.isPresent()) {
        org.opendaylight.yang.gen.v1.urn.opendaylight.faas.fabric.rev150930.fabric.attributes.Options opt = result.get();
        org.opendaylight.yang.gen.v1.urn.opendaylight.faas.fabric.rev150930.FabricOptions.TrafficBehavior behavior = opt.getTrafficBehavior();
        ctx.setTrafficBehavior((behavior == null ? org.opendaylight.yang.gen.v1.urn.opendaylight.faas.fabric.rev150930.FabricOptions.TrafficBehavior.Normal : behavior));
    }else {
        ctx.setTrafficBehavior(TrafficBehavior.Normal);
    }
    openflow13Provider.updateTrafficBehavior(ctx.getDpid(), ctx.getTrafficBehavior(), true);
}