@java.lang.SuppressWarnings(value = "serial")
static com.ibm.streamsx.topology.function.Function<java.lang.String, com.ibm.streamsx.topology.test.api.ChannelAndSequence> stringTupleChannelSeqTransformer() {
    return new com.ibm.streamsx.topology.test.api.ParallelTest.ChannelGetter<java.lang.String, com.ibm.streamsx.topology.test.api.ChannelAndSequence>() {
        @java.lang.Override
        public com.ibm.streamsx.topology.test.api.ChannelAndSequence apply(java.lang.String v) {
            return new com.ibm.streamsx.topology.test.api.ChannelAndSequence(this.channel, java.lang.Integer.parseInt(v));
        }
    };
}