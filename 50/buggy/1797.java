@java.lang.Override
public void propagate(cl.uchile.dcc.cc4401.protosim.components.InstanceState state) {
    java.lang.Integer cid = state.getInstance().getComponentId();
    cl.uchile.dcc.cc4401.protosim.components.Value o = cl.uchile.dcc.cc4401.protosim.libraries.ProtoValue.TRUE;
    o.setFromId(cid);
    state.setPort(0, o, Breadboard.DELAY);
}