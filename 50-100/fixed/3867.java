@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    java.lang.String logs = science.atlarge.granula.util.FileUtil.readFile(file);
    for (java.lang.String line : logs.split("\n")) {
        if (line.contains("- run algorithm:")) {
            java.util.regex.Pattern regex = java.util.regex.Pattern.compile(".* - run algorithm: ([+-]?([0-9]*[.])?[0-9]+) sec.*");
            java.util.regex.Matcher matcher = regex.matcher(line);
            matcher.find();
            superstepTimes.add(java.lang.Double.parseDouble(matcher.group(1)));
        }
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}