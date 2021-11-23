private net.oneandone.sushi.fs.file.FileNode newTmpFile(net.oneandone.sushi.fs.file.FileNode parent) {
    net.oneandone.sushi.fs.file.FileNode file;
    while (true) {
        file = parent.join(("_tmp_" + (net.oneandone.lavender.modules.SvnModule.tmpNo)));
        try {
            file.mkfile();
            file.getWorld().onShutdown().deleteAtExit(file);
            return file;
        } catch (net.oneandone.sushi.fs.MkfileException e) {
        }
    } 
}