public java.lang.String makePath(java.lang.String path) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(root);
    sb.append(path);
    sb.append(java.io.File.separatorChar);
    return sb.toString();
}