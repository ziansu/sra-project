public void run() {
    java.lang.String respInfo = com.sam.yh.common.msg.CtcSmsUtils.getSms();
    java.util.List<com.sam.yh.common.msg.ReplaySms> smsMap = parseResp(respInfo);
    forwardSmsByMail(smsMap);
}