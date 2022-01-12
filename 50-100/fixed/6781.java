public static org.openremote.model.syslog.SyslogLevel getLevel(int level) {
    if (level == 1000) {
        return org.openremote.model.syslog.SyslogLevel.ERROR;
    }else
        if (level == 900) {
            return org.openremote.model.syslog.SyslogLevel.WARN;
        }else
            if ((level == 800) || (level == 700)) {
                return org.openremote.model.syslog.SyslogLevel.INFO;
            }
        
    
    return null;
}