@java.lang.Override
public java.util.Calendar convert(java.lang.Class<?> argType, java.lang.reflect.Type[] actualTypes, java.lang.String argString) throws java.lang.Exception {
    java.util.Calendar calendar;
    if (!(com.google.common.base.Strings.isNullOrEmpty(argString))) {
        calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(argString));
    }else {
        calendar = null;
    }
    return calendar;
}