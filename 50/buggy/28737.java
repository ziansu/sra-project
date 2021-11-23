public static void reset() {
    com.google.devtools.j2objc.util.ErrorUtil.errorCount = 0;
    com.google.devtools.j2objc.util.ErrorUtil.warningCount = 0;
    com.google.devtools.j2objc.util.ErrorUtil.currentFileName = null;
    com.google.devtools.j2objc.util.ErrorUtil.errorMessages = com.google.common.collect.Lists.newArrayList();
    com.google.devtools.j2objc.util.ErrorUtil.warningMessages = com.google.common.collect.Lists.newArrayList();
}