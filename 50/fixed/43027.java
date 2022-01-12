public static void delete(java.lang.String type, java.lang.String group, java.lang.String topic) {
    cc.triffic.wc.kafkamonitor.utils.DBZKDataUtils.delete(type, group, topic, "alarm");
}