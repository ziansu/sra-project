private void print(com.thebuzzmedia.exiftool.logs.DefaultLogger.Level level, java.lang.CharSequence message, java.lang.Object... params) {
    if (isEnabled(level)) {
        java.lang.String str = (message == null) ? null : message.toString();
        if ((str != null) && ((params.length) > 0)) {
            str = java.lang.String.format(str, params);
        }
        java.lang.System.out.println(java.lang.String.format(((("[" + level) + "] [exiftool] ") + str)));
    }
}