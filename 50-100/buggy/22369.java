public void write(lk.filetributed.client.rpc.services.TProtocol oprot, lk.filetributed.client.rpc.services.JoinNode.joinRequest_result struct) throws org.apache.thrift.TException {
    struct.validate();
    oprot.writeStructBegin(lk.filetributed.client.rpc.services.JoinNode.joinRequest_result.STRUCT_DESC);
    if ((struct.success) != null) {
        oprot.writeFieldBegin(lk.filetributed.client.rpc.services.JoinNode.joinRequest_result.SUCCESS_FIELD_DESC);
        oprot.writeString(struct.success);
        oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
}