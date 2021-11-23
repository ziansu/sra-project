@java.lang.Override
public void send() {
    com.subterranean_security.crimson.core.proto.Delta.EV_ProfileDelta pd = gather();
    if (((pd.getStrAttrCount()) != 0) || ((pd.getGroupAttrCount()) != 0)) {
        ClientStore.Connections.route(com.subterranean_security.crimson.core.proto.MSG.Message.newBuilder().setSid(Common.cvid).setRid(param.getVID()).setEvProfileDelta(pd));
    }
}