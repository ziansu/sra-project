public boolean canProvide(ch.epfl.data.squall.utilities.SquallContext context, java.lang.String name) {
    if (context.isDistributed()) {
        return true;
    }else {
        java.lang.String path = ((basePath) + "/") + name;
        java.io.File f = new java.io.File(path);
        return f.isFile();
    }
}