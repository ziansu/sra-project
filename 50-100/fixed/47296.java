private static java.lang.String defattr(org.kantega.reststop.maven.dist.FilePerm filePerm, java.lang.String path) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append("%defattr(").append(filePerm.getFileMode()).append(", ").append(filePerm.getUser()).append(", ").append(filePerm.getGroup()).append(", ").append(filePerm.getDirMode()).append(") ").append(path);
    return builder.toString();
}