@java.lang.Override
public void run() {
    java.lang.String isOpenTrack = xApplication.getIsOpenTrack(orderInfo.getOrderNo());
    if ((null != isOpenTrack) && (isOpenTrack.equals(orderInfo.getOrderNo()))) {
        xApplication.isOpenTrackRemove(orderInfo.getOrderNo());
        com.ybg.rp.vmbase.utils.LogUtil.e("----------线上支付--------PUSH");
        com.ybg.rp.vm.serial.PushOpenTrackNoUtils.shipmentLine(context, orderInfo);
    }else {
        log.info(("------柜门已打开/没有改订单数据---  " + (orderInfo.getOrderNo())));
    }
}