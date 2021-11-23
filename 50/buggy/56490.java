@java.lang.Override
public void onCancel(java.util.Map<java.lang.String, java.lang.Object> map) {
    com.iflytek.unipay.js.ToastUtil.toastOnTV("订单取消");
    com.iflytek.unipay.js.PayCallBack.payCallback("Pay", "cancel");
}