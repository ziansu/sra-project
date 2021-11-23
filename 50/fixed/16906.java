@java.lang.Override
public void onTimeout(jane.core.NetManager mgr, org.apache.mina.core.session.IoSession ses, jane.bean.TestRpcBean rpcBean) {
    Log.log.error("{}: onTimeout: {}", getClass().getName(), rpcBean.getArg());
    ses.close(false);
}