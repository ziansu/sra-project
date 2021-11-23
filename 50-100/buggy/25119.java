public static void writeLog(java.lang.Exception message) {
    switch (net.scnetwork.bus.enums.LogEnums.valueOf(net.scnetwork.bus.utils.LogBus.logConfig.getType())) {
        case LOCAL :
            net.scnetwork.bus.utils.LogBus.logger.info(message.toString());
            break;
        case POSTGRESQL :
            break;
        case MYSQL :
            break;
        case ORACLE :
            break;
        case SQLITE :
            break;
        case SYSLOG :
            break;
        default :
            break;
    }
}