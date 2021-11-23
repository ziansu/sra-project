@com.alibaba.fastjson.annotation.JSONField(serialize = false)
public boolean isEnded(java.util.Date now) {
    try {
        return ((status) != 1) || (((TimeUtil.SHORT_DATE_FORMAT.parse(TimeUtil.SHORT_DATE_FORMAT.format(endTime)).getTime()) + (((24 * 60) * 60) * 1000)) <= (now.getTime()));
    } catch (java.text.ParseException e) {
        return true;
    }
}