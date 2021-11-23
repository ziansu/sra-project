@java.lang.Override
public java.lang.Iterable<com.ibm.streamsx.topology.tuple.BeaconTuple> get() {
    java.util.List<com.ibm.streamsx.topology.tuple.BeaconTuple> ret = new java.util.ArrayList<com.ibm.streamsx.topology.tuple.BeaconTuple>();
    for (int i = 0; i < count; i++) {
        for (int j = 0; j < 5; j++) {
            ret.add(new com.ibm.streamsx.topology.tuple.BeaconTuple(i));
        }
    }
    return ret;
}