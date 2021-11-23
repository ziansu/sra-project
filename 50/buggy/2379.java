static final void log(final java.lang.Exception ex) {
    java.lang.System.out.println((('[' + (Config.format.format(java.time.LocalTime.now()))) + "] An exception has been thrown:"));
    java.lang.System.out.println(ex.toString());
}