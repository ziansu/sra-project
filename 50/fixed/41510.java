@java.lang.Override
public void onChange(cn.bmob.newim.core.ConnectionStatus status) {
    toast(status.getMsg());
}