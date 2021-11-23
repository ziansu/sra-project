private void loadStack(java.lang.String arg) {
    path = arg;
    if (null == (path)) {
        return ;
    }
    openStack(path);
    if (((vStack) == null) || (vStack.fileIsNull())) {
        java.lang.System.out.println("MMF file null");
        return ;
    }
}