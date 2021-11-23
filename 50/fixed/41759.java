public static java.lang.Class getNewClass() {
    java.lang.Class result = com.kmbapps.classscheduler.ClassLoader.newClass;
    com.kmbapps.classscheduler.ClassLoader.newClass = null;
    return result;
}