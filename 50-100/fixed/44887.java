public static void traverse(java.io.File file, com.yahoo.storm.yarn.Util.FileVisitor visitor) {
    if (file.isDirectory()) {
        java.io.File[] childs = file.listFiles();
        if ((childs.length) > 0) {
            for (int i = 0; i < (childs.length); i++) {
                java.io.File child = childs[i];
                com.yahoo.storm.yarn.Util.traverse(child, visitor);
            }
        }
    }else {
        visitor.visit(file);
    }
}