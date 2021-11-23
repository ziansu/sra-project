public static java.lang.String getTimestampedFileNameForDirectory(java.io.File file) {
    java.lang.String s = com.mcgame.util.ScreenshotUtil.dateFormat.format(new java.util.Date()).toString();
    java.util.List<java.lang.String> filenameList = scala.actors.threadpool.Arrays.asList(file.list());
    int i = 1;
    java.lang.String name = s + ".png";
    do {
        if (!(filenameList.contains(name)))
            return name;
        
        ++i;
        name = ((s + "_") + i) + ".png";
    } while (true );
}