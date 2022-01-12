@java.lang.Override
public boolean validate(org.g6.laas.core.file.ILogFile file) {
    boolean isFile = org.g6.util.FileUtil.isFile(file.getPath());
    java.util.List<java.lang.String> firstLines = org.g6.util.FileUtil.readFirstNLines(new java.io.File(file.getPath()), 10L);
    java.util.List<java.lang.String> lastLines = org.g6.util.FileUtil.readLastNLines(new java.io.File(file.getPath()), 10L);
    return isFile && ((isValidFile(firstLines)) || (isValidFile(lastLines)));
}