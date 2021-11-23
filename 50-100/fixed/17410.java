@java.lang.Override
public int execute(@org.jetbrains.annotations.NotNull
java.io.InputStream in, @org.jetbrains.annotations.NotNull
ru.spbau.mit.parsing.Token[] args) {
    try {
        int i = 0;
        for (ru.spbau.mit.parsing.Token arg : args) {
            i++;
            out.write(arg.getContent().getBytes());
            if (i != (args.length)) {
                out.write(" ".getBytes());
            }
        }
        out.write("\n".getBytes());
    } catch (java.io.IOException e) {
        ru.spbau.mit.commands.EchoCommand.LOGGER.log(java.util.logging.Level.WARNING, "could not write to output stream", e);
        return 1;
    }
    return 0;
}