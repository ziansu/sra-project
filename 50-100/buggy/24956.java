public cn.drct.wepay.entity.TransfersResult transfers(cn.drct.wepay.entity.Transfers transfers, int connectTimeoutMs, int readTimeoutMs) throws cn.drct.wepay.exception.MsgException, cn.drct.wepay.exception.TradeException, java.lang.Exception {
    java.lang.String url;
    if (config.isUseSandbox()) {
        url = WXPayConstants.SANDBOX_TRANSFERS_URL;
    }else {
        url = WXPayConstants.TRANSFERS_URL;
    }
    java.lang.String respXml = this.requestWithCert(url, this.fillTransfersRequestData(cn.drct.wepay.util.ReflectUtil.toMap(transfers)), connectTimeoutMs, readTimeoutMs);
    return processResponseXml(respXml, cn.drct.wepay.entity.TransfersResult.class);
}