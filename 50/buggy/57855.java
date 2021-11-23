public static java.lang.String fileName(org.sugarj.common.path.Path file_doof) {
    return org.sugarj.common.FileCommands.fileName(org.sugarj.common.FileCommands.toCygwinPath(file_doof.getAbsolutePath()));
}