private boolean rm(java.lang.String cmd) throws java.io.IOException {
    java.lang.String command = ch.deletescape.jterm.CommandUtils.parseInlineCommands(cmd);
    java.nio.file.Path path = ch.deletescape.jterm.JTerm.getCurrPath().resolve(ch.deletescape.jterm.Util.makePathString(command)).toRealPath();
    try {
        java.nio.file.Files.delete(path);
        return true;
    } catch (java.nio.file.NoSuchFileException e) {
        Printer.out.println(ch.deletescape.jterm.config.Resources.getString("PathNotFound"), path);
        ch.deletescape.jterm.commandcontexts.SingleFiles.LOGGER.error(e.toString(), e);
    }
    return false;
}