private remonsinnema.blog.scmlog.log.Line parseLine(java.lang.String line) {
    for (remonsinnema.blog.scmlog.log.Line.Type type : Line.Type.values()) {
        if (line.startsWith(type.toString())) {
            return new remonsinnema.blog.scmlog.log.Line(type, line.substring(type.toString().length()));
        }
    }
    throw new java.lang.IllegalArgumentException(("Invalid change hunk line: " + line));
}