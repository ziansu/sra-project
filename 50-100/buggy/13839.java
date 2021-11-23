@java.lang.Override
public java.util.Calendar convert(java.lang.Class<?> argType, java.lang.reflect.Type[] actualTypes, java.lang.String argString) throws java.lang.Exception {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    if (!(com.google.common.base.Strings.isNullOrEmpty(argString))) {
        calendar.setTime(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(argString));
    }
    return calendar;
}