@java.lang.Override
public void success(com.cqgk.clerk.bean.normal.JIesuanReturnBean result) {
    onResume();
    vipInfo = result;
    showVipInfo();
}