private boolean filter(java.nio.file.Path path) {
    java.lang.String pathString = path.toString();
    for (org.roda.rodain.rules.filters.ContentFilter cf : filters) {
        if (cf.filter(pathString))
            return true;
        
    }
    if ((path.getFileName()) == null) {
        return true;
    }
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(templateType);
    java.util.regex.Matcher m = p.matcher(path.getFileName().toString());
    return m.matches();
}