public static boolean send(java.lang.String mobile, java.lang.String template, org.giiwa.core.json.JSON jo) {
    jo.put("template", "user.forget.password");
    org.giiwa.framework.bean.OpLog.info("sms", jo.toString(), null);
    for (org.giiwa.framework.noti.Sms.ISender s : org.giiwa.framework.noti.Sms.senders) {
        if (s.send(mobile, jo)) {
            return true;
        }
    }
    return false;
}