@java.lang.Override
public void write(lk.filetributed.client.rpc.services.TProtocol prot, lk.filetributed.client.rpc.services.JoinNode.joinRequest_result struct) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TTupleProtocol oprot = ((org.apache.thrift.protocol.TTupleProtocol) (prot));
    java.util.BitSet optionals = new java.util.BitSet();
    if (struct.isSetSuccess()) {
        optionals.set(0);
    }
    oprot.writeBitSet(optionals, 1);
    if (struct.isSetSuccess()) {
        oprot.writeString(struct.success);
    }
}