public static java.lang.String getCallingMethod(int offset) {
    java.lang.StackTraceElement found = org.openstreetmap.josm.tools.bugreport.BugReport.getCallingMethod((offset + 1), org.openstreetmap.josm.tools.bugreport.BugReport.class.getName(), "getCallingMethod"::equals);
    if (found != null) {
        return ((found.getClassName().replaceFirst(".*\\.", "")) + '#') + (found.getMethodName());
    }else {
        return "?";
    }
}