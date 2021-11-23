@java.lang.Override
public void onTimeout(final jane.core.NetManager manager, final org.apache.mina.core.session.IoSession session, final jane.bean.TestRpcBean rpcBean) {
    final jane.bean.TestBean arg = rpcBean.getArg();
    Log.log.error("{}: onTimeout: {}", getClass().getName(), arg);
}