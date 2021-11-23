@java.lang.Override
public com.ibm.streamsx.topology.test.api.ChannelAndSequence apply(com.ibm.streamsx.topology.tuple.BeaconTuple v) {
    return new com.ibm.streamsx.topology.test.api.ChannelAndSequence(this.channel, ((int) (v.getSequence())));
}