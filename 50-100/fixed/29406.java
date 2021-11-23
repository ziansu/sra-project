java.lang.String rm(java.lang.String cmd) throws java.io.IOException {
    java.lang.String command = ch.deletescape.jterm.CommandUtils.parseInlineCommands(cmd);
    try {
        java.nio.file.Path path = ch.deletescape.jterm.JTerm.getCurrPath().resolve(ch.deletescape.jterm.Util.makePathString(command)).toRealPath();
        java.nio.file.Files.delete(path);
        return path.toString();
    } catch (java.nio.file.NoSuchFileException e) {
        ch.deletescape.jterm.commandcontexts.SingleFiles.LOGGER.error(e.toString(), e);
        return Printer.out.println(ch.deletescape.jterm.config.Resources.getString("PathNotFound"), cmd);
    }
}