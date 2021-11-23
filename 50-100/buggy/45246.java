private boolean debugOptionChange(java.lang.String source) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("/\\*\\s*\\d+\\s*\\*/");
    java.util.regex.Matcher matcher = pattern.matcher(source);
    boolean isDebugSource = (matcher.find()) || ((source.indexOf(DecompilerOutputUtil.NO_LINE_NUMBER)) != (-1));
    return isDebugSource != ((org.sf.feeling.decompiler.util.UIUtil.isDebugPerspective()) || (org.sf.feeling.decompiler.JavaDecompilerPlugin.getDefault().isDisplayLineNumber()));
}