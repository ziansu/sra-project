public static java.lang.String getCallingMethod(int offset) {
    java.lang.String className = org.openstreetmap.josm.tools.bugreport.BugReport.class.getName();
    java.lang.String methodName = "getCallingMethod";
    java.lang.StackTraceElement found = org.openstreetmap.josm.tools.bugreport.BugReport.getCallingMethod(offset, className, methodName::equals);
    if (found != null) {
        return ((found.getClassName().replaceFirst(".*\\.", "")) + '#') + (found.getMethodName());
    }else {
        return "?";
    }
}