@java.lang.Override
public com.ibm.streamsx.topology.test.api.ChannelAndSequence apply(java.lang.String v) {
    return new com.ibm.streamsx.topology.test.api.ChannelAndSequence(channel, java.lang.Integer.parseInt(v));
}