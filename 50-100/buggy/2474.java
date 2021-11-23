public static void w(java.lang.String tag, java.lang.String string, java.lang.Throwable t) {
    java.lang.System.out.println((((((org.jraf.androidcontentprovidergenerator.Log.FORMAT.format(new java.util.Date())) + " W/") + tag) + " ") + string));
    t.printStackTrace();
}