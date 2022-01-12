public <T> T processResponseXml(java.lang.String xmlStr, java.lang.Class<T> clazz) throws cn.drct.wepay.exception.MsgException, cn.drct.wepay.exception.TradeException, java.lang.Exception {
    return processResponseXml(xmlStr, clazz, true);
}